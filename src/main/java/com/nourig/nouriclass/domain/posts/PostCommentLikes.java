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

public class PostCommentLikes extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postCommentLikeId;

    @ManyToOne
    @JoinColumn(name = "post_comment_id", nullable = false)
    private PostComments postComment;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @Column(nullable = false)
    private LocalDate date;  // 좋아요 누른 날짜 시간
}
