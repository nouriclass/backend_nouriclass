package com.nourig.nouriclass.domain.articles;

import com.nourig.nouriclass.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Articles extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long articleId;

    @Column(nullable = false, length = 255)
    private String title;  // 게시물 제목

    @Column(nullable = false)
    private LocalDate date;  // 게시물 날짜 시간

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;  // 게시물 내용

    @Column(columnDefinition = "JSON")
    private String images;  // 게시물 이미지 (JSON 형식)
}
