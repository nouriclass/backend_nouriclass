package com.nourig.nouriclass.domain.posts;

import com.nourig.nouriclass.domain.Users;
import com.nourig.nouriclass.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Posts extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @Column(nullable = false)
    private boolean onlyMember;  // 멤버 전용 여부

    @Column(nullable = false, length = 255)
    private String title;  // 게시물 제목

    @Column(nullable = false)
    private LocalDate date;  // 게시물 작성 날짜 시간

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;  // 게시물 내용

    @Column(columnDefinition = "JSON")
    private String images;  // 게시물 이미지 (JSON 형식)
}
