package com.nishintgoyal.UberXBackend.Services.impl;


import com.nishintgoyal.UberXBackend.DTO.DriverDto;
import com.nishintgoyal.UberXBackend.DTO.RideDto;
import com.nishintgoyal.UberXBackend.DTO.RideRequestDto;
import com.nishintgoyal.UberXBackend.DTO.RiderDto;
import com.nishintgoyal.UberXBackend.Entities.DriverEntity;
import com.nishintgoyal.UberXBackend.Entities.Enums.RideStatusEnum;
import com.nishintgoyal.UberXBackend.Entities.RideEntity;
import com.nishintgoyal.UberXBackend.Entities.RiderEntity;
import com.nishintgoyal.UberXBackend.Entities.UserEntity;
import com.nishintgoyal.UberXBackend.Services.RideService;
import com.nishintgoyal.UberXBackend.Services.RiderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideServiceImpl implements RideService
{

    @Override
    public RideEntity getRideById(Long rideId) {
        return null;
    }

    @Override
    public void matchWithDriver(RideRequestDto rideRequestDto)
    {

    }

    @Override
    public RideEntity createNewRide(RideRequestDto rideRequestDto, DriverEntity driverEntity) {
        return null;
    }

    @Override
    public RideEntity updateRideStatus(Long rideId, RideStatusEnum rideStatusEnum) {
        return null;
    }

    @Override
    public Page<RideEntity> getAllRidesOfRider(Long riderId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<RideEntity> getAllRidesOfDriver(Long driverId, PageRequest pageRequest) {
        return null;
    }


}

