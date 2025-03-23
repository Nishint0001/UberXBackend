package com.nishintgoyal.UberXBackend.Strategies.impl;


import com.nishintgoyal.UberXBackend.Entities.DriverEntity;
import com.nishintgoyal.UberXBackend.Entities.RideRequestEntity;
import com.nishintgoyal.UberXBackend.Repositories.DriverRepository;
import com.nishintgoyal.UberXBackend.Strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy
{
    private final DriverRepository driverRepository;
    @Override
    public List<DriverEntity> findMatchingDriver(RideRequestEntity rideRequestEntity)
    {
        return driverRepository.findTenNearestDrivers(rideRequestEntity.getPickUpLocation());
    }
}
