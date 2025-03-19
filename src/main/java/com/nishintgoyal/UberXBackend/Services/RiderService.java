package com.nishintgoyal.UberXBackend.Services;


import com.nishintgoyal.UberXBackend.DTO.DriverDto;
import com.nishintgoyal.UberXBackend.DTO.RideDto;
import com.nishintgoyal.UberXBackend.DTO.RideRequestDto;
import com.nishintgoyal.UberXBackend.DTO.RiderDto;
import com.nishintgoyal.UberXBackend.Entities.RiderEntity;
import com.nishintgoyal.UberXBackend.Entities.UserEntity;

import java.util.List;

public interface RiderService
{
    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();

    RiderEntity createNewRider(UserEntity userEntity);

}
