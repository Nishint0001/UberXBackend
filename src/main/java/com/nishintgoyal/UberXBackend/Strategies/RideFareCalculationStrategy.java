package com.nishintgoyal.UberXBackend.Strategies;

import com.nishintgoyal.UberXBackend.Entities.RideRequestEntity;

public interface RideFareCalculationStrategy
{
    double Ride_Fare_Multiplier=10;
    double calculateFare(com.nishintgoyal.UberXBackend.Entities.RideRequestEntity rideRequest);

}
