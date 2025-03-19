package com.nishintgoyal.UberXBackend.Services.impl;

import com.nishintgoyal.UberXBackend.DTO.DriverDto;
import com.nishintgoyal.UberXBackend.DTO.RideDto;
import com.nishintgoyal.UberXBackend.DTO.RiderDto;
import com.nishintgoyal.UberXBackend.Services.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {
    @Override
    public RideDto acceptRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto startRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto endRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto rateRider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}
