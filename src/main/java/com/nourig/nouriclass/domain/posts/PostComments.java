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
public class PostComments extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postCommentId;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Posts post;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @Column(nullable = false)
    private LocalDate date;  // 댓글 작성 날짜 시간

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;  // 댓글 내용
}
