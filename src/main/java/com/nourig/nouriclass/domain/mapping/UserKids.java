package com.nourig.nouriclass.domain.mapping;

import com.nourig.nouriclass.domain.kids.Kids;
import com.nourig.nouriclass.domain.Users;
import com.nourig.nouriclass.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class UserKids extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @ManyToOne
    @JoinColumn(name = "kid_id", nullable = false)
    private Kids kid;

    /*@Column(nullable = false)
    private String relationship;  // 관계 (예: 부모, 보호자 등)*/
}
