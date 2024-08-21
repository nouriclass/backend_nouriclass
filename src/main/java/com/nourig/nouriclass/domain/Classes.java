package com.nourig.nouriclass.domain;

import com.nourig.nouriclass.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Classes extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classId;

    @ManyToOne
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teachers teacher;  // 담당 강사

    @ManyToOne
    @JoinColumn(name = "format_id", nullable = false)
    private Format format;  // 수업 형식

    @Column(nullable = false, columnDefinition = "TEXT")
    private String title;  // 수업 제목

    @Column(columnDefinition = "TEXT")
    private String description;  // 수업 설명

    @Column(nullable = false, length = 10)
    private String age;  // 수강생의 나이대

    @Column(nullable = false)
    private Integer maxKids;  // 최대 수강생 수

    @Column(nullable = false)
    private LocalDate date;  // 수업 날짜

    @Column(nullable = false)
    private LocalTime startTime;  // 수업 시작 시간

    @Column(nullable = false)
    private LocalTime duration;  // 수업 진행 시간

    @Column(columnDefinition = "JSON")
    private String materials;  // 준비물 (JSON 형식)
}
