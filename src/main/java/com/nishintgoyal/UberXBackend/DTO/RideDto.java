package com.nishintgoyal.UberXBackend.DTO;


import com.nishintgoyal.UberXBackend.Entities.Enums.PaymentMethodEnum;
import com.nishintgoyal.UberXBackend.Entities.Enums.RideStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideDto
{
    private Long id;

    private PointDto pickUpLocation;

    private PointDto  dropOffLocation;

    private LocalDateTime createdTime;

    private RiderDto riderDto;

    private DriverDto driverDto;

    private PaymentMethodEnum paymentMethodEnum;

    private RideStatusEnum rideStatusEnum;

    private Double fare;

    private LocalDateTime startedAt;

    private LocalDateTime endedAt;

    private String otp;
}


