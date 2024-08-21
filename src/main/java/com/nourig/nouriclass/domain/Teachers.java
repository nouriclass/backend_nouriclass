package com.nourig.nouriclass.domain;

import com.nourig.nouriclass.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Teachers extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teacherId;

    @Column(nullable = false, length = 30)
    private String name;  // 선생님 이름

    @Column(nullable = true, length = 30)
    private String image;  // 선생님 사진 (이미지 파일명)

    @Column(columnDefinition = "TEXT")
    private String introduction;  // 선생님 소개

    @Column(columnDefinition = "JSON")
    private String bio;  // 선생님의 경력 및 정보 (JSON 형식)
}
