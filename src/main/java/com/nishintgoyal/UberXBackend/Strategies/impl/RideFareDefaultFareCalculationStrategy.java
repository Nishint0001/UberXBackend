package com.nishintgoyal.UberXBackend.Strategies.impl;

import com.nishintgoyal.UberXBackend.Entities.RideRequestEntity;
import com.nishintgoyal.UberXBackend.Services.DistanceService;
import com.nishintgoyal.UberXBackend.Strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy
{
    private final DistanceService distanceService;
    @Override
    public double calculateFare(RideRequestEntity rideRequest)
    {
        Double distance=distanceService.calculateDistance(rideRequest.getPickUpLocation(), rideRequest.getDropOffLocation());
        return distance*Ride_Fare_Multiplier;
    }
}
