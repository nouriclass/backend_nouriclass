package com.nourig.nouriclass.domain;

import com.nourig.nouriclass.domain.common.BaseEntity;
import jakarta.persistence.*;

import java.time.LocalDate;

public class PersonalNotifications extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notificationId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @Column(nullable = false, length = 255)
    private String title;  // 알림 제목

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;  // 알림 내용

    @Column(nullable = false)
    private LocalDate date;  // 알림 날짜 시간

    @Column(length = 255)
    private String icon;  // 알림 아이콘 (파일명)
}
