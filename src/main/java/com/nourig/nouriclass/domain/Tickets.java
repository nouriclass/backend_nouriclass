package com.nourig.nouriclass.domain;


import com.nourig.nouriclass.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Tickets extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;

    @Column(nullable = false, length = 50)
    private String name;                            // 수강권 명

    @Column(nullable = false)
    private Integer classCount;                     // 수강권 갯수

    @Column(nullable = true)
    private Integer extraClassCount;                // 추가 제공 수업 횟수

    @Column(nullable = true)
    private Integer cancellationCount;              // 취소 가능 횟수

    @Column(nullable = true)
    private Integer price;                          // 가격 => 결제 : 카카오 페이

    @Column(length = 255)
    private String priceDescription;                // 가격 설명

    @Column(nullable = false)
    private Integer validDays;                      // 유효 기간 (일수)
}
