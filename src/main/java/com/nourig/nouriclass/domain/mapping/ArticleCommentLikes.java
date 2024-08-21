package com.nourig.nouriclass.domain.mapping;

import com.nourig.nouriclass.domain.articles.ArticleComments;
import com.nourig.nouriclass.domain.Users;
import com.nourig.nouriclass.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class ArticleCommentLikes extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long articleCommentLikeId;

    @ManyToOne
    @JoinColumn(name = "comment_id", nullable = false)
    private ArticleComments comment;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @Column(nullable = false)
    private LocalDateTime date;
}
