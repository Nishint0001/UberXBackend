package com.nishintgoyal.UberXBackend.Services;



import com.nishintgoyal.UberXBackend.DTO.DriverDto;
import com.nishintgoyal.UberXBackend.DTO.RideDto;
import com.nishintgoyal.UberXBackend.DTO.RiderDto;

import java.util.List;

public interface DriverService
{
    RideDto acceptRide(Long rideId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RiderDto rateRider(Long rideId, Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();

}
