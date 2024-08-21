package com.nourig.nouriclass.domain;

import com.nourig.nouriclass.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Format extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long formatId;  // 4matid

    @Column(nullable = false, length = 10)
    private String field;  // 수업 타입 이름

    @Column(nullable = false, length = 20)
    private String color;  // 수업 타입 색상

/*    @Column(nullable = false, length = 50)
    private String formatType;  // 형식의 종류 (예: PDF, Video 등)

    @Column(length = 255)
    private String description;  // 형식에 대한 설명*/
}
