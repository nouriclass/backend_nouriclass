package com.nourig.nouriclass.domain.kids;

import com.nourig.nouriclass.domain.common.BaseEntity;
import com.nourig.nouriclass.domain.enums.Gender;
import com.nourig.nouriclass.domain.enums.Status;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Kids extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kidId;

    @Column(nullable = true)
    private Integer ticketId;

    @Column(nullable = true)
    private LocalDateTime ticketPurchaseDate;           // 티켓 구매 날짜수 (현재 날짜 - 티켓 구매 날짜)

    @Column(nullable = false, length = 30)
    private String name;                                // 아이 이름

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 6)
    private Gender gender;                              // 아이 성별 (MALE, FEMALE)

    @Column(length = 10)
    private String birth;                               // 아이 출생

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10)
    private Status status = Status.REQUESTED;           // 가입 상태 (requested, completed)

    @Column(length = 100)
    private String affiliation;                         // 소속 (학교, 유치원 등)

    @Column(columnDefinition = "TEXT")
    private String description;                         // 가입 시 아이에 대한 설명


}
