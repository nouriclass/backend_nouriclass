package com.nourig.nouriclass.domain.kids;

import com.nourig.nouriclass.domain.Classes;
import com.nourig.nouriclass.domain.common.BaseEntity;
import com.nourig.nouriclass.domain.enums.KidsClassStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class KidClasses extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kidClassId;

    @ManyToOne
    @JoinColumn(name = "class_id", nullable = false)
    private Classes classes;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10)
    private KidsClassStatus status;  // 수강 상태 (Enrolled, Waitlisted, Cancelled) : 수강, 대기, 취소

    @Column(nullable = false)
    private boolean attendance;  // 출석 체크 여부

    @Column(columnDefinition = "TEXT")
    private String message;  // 수업이 끝나고 남긴 메시지

    @Column(columnDefinition = "JSON")
    private String images;  // 여러 개의 이미지 (JSON 형식)
}
