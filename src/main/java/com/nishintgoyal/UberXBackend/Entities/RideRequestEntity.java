package com.nishintgoyal.UberXBackend.Entities;


import com.nishintgoyal.UberXBackend.Entities.Enums.PaymentMethodEnum;
import com.nishintgoyal.UberXBackend.Entities.Enums.RideRequestStatusEnum;
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
public class RideRequestEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "Geometry(Point,4326)")
    Point pickUpLocation;

    @Column(columnDefinition = "Geometry(Point,4326)")
    Point dropOffLocation;

    @CreationTimestamp
    private LocalDateTime requestedTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private RiderEntity riderEntity;

    @Enumerated(EnumType.STRING)
    private PaymentMethodEnum paymentMethodEnum;

    @Enumerated(EnumType.STRING)
    private RideRequestStatusEnum rideRequestStatusEnum;

    private Double fare;

}
