package com.nishintgoyal.UberXBackend.Entities;


import com.nishintgoyal.UberXBackend.Entities.Enums.PaymentMethodEnum;
import com.nishintgoyal.UberXBackend.Entities.Enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Payment
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    @CreationTimestamp
    private LocalDateTime paymentTime;

    @Enumerated(EnumType.STRING)
    private PaymentMethodEnum paymentMethod;

    @OneToOne(fetch = FetchType.LAZY)
    private RideEntity ride;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
}
