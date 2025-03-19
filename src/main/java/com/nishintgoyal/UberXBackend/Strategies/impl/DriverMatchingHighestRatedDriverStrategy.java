package com.nishintgoyal.UberXBackend.Strategies.impl;

import com.nishintgoyal.UberXBackend.Entities.DriverEntity;
import com.nishintgoyal.UberXBackend.Entities.RideRequestEntity;
import com.nishintgoyal.UberXBackend.Strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy
{
    @Override
    public List<DriverEntity> findMatchingDriver(RideRequestEntity rideRequestEntity) {
        return List.of();
    }
}
