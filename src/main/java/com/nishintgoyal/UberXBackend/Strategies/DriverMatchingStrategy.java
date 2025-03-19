package com.nishintgoyal.UberXBackend.Strategies;


import com.nishintgoyal.UberXBackend.Entities.DriverEntity;
import com.nishintgoyal.UberXBackend.Entities.RideRequestEntity;

import java.util.List;

public interface DriverMatchingStrategy
{
    List<DriverEntity> findMatchingDriver(RideRequestEntity rideRequestEntity);
}
