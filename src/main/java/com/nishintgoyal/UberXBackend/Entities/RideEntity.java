package com.nishintgoyal.UberXBackend.Entities;


import com.nishintgoyal.UberXBackend.Entities.Enums.PaymentMethodEnum;
import com.nishintgoyal.UberXBackend.Entities.Enums.RideStatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RideEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "Geometry(Point,4326)")
    Point pickUpLocation;

    @Column(columnDefinition = "Geometry(Point,4326)")
    Point dropOffLocation;

    @CreationTimestamp
    private LocalDateTime createdTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private RiderEntity riderEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    private DriverEntity driverEntity;

    @Enumerated(EnumType.STRING)
    private PaymentMethodEnum paymentMethodEnum;

    @Enumerated(EnumType.STRING)
    private RideStatusEnum rideStatusEnum;

    private Double fare;

    private LocalDateTime startedAt;

    private LocalDateTime endedAt;

    private String otp;
}
