package com.nishintgoyal.UberXBackend.DTO;


import com.nishintgoyal.UberXBackend.Entities.Enums.PaymentMethodEnum;
import com.nishintgoyal.UberXBackend.Entities.Enums.RideRequestStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDto
{
    private Long id;

    private PointDto pickUpLocation;

    private PointDto dropOffLocation;

    private LocalDateTime requestedTime;

    private RiderDto riderDto;

    private PaymentMethodEnum paymentMethodEnum;

    private RideRequestStatusEnum rideRequestStatusEnum;

}
