package com.nourig.nouriclass.domain.mapping;


import com.nourig.nouriclass.domain.Classes;
import com.nourig.nouriclass.domain.Users;
import com.nourig.nouriclass.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class TeacherClasses extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "teacher_id", nullable = false)
    private Users teacher;

    @ManyToOne
    @JoinColumn(name = "class_id", nullable = false)
    private Classes classes;
}
