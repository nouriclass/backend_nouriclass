package com.nourig.nouriclass.domain;

import com.nourig.nouriclass.domain.common.BaseEntity;
import com.nourig.nouriclass.domain.enums.Gender;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Users extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 10)
    private String name;

    @Column(nullable = false, length = 30)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 6)
    private Gender gender;                              // 성별 (MALE, FEMALE)

    @Column(length = 30)
    private String phone;

    @Column(length = 10)
    private String birth;

    @Column(nullable = false)
    private boolean admin;

    @Column(nullable = false)
    private boolean kakaoLogin;
}
