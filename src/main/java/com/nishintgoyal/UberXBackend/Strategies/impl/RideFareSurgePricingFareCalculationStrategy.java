package com.nishintgoyal.UberXBackend.Strategies.impl;

import com.nishintgoyal.UberXBackend.Entities.RideRequestEntity;
import com.nishintgoyal.UberXBackend.Services.DistanceService;
import com.nishintgoyal.UberXBackend.Strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RideFareSurgePricingFareCalculationStrategy implements RideFareCalculationStrategy
{
    private final DistanceService distanceService;
    private static final double SURGE_FACTOR=2;

    @Override
    public double calculateFare(RideRequestEntity rideRequest)
    {
        double distance=distanceService.calculateDistance(rideRequest.getPickUpLocation(), rideRequest.getDropOffLocation());
        return distance*Ride_Fare_Multiplier*SURGE_FACTOR;
    }
}
