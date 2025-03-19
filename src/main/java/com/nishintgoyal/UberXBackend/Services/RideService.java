package com.nishintgoyal.UberXBackend.Services;


import com.nishintgoyal.UberXBackend.DTO.RideRequestDto;
import com.nishintgoyal.UberXBackend.Entities.DriverEntity;
import com.nishintgoyal.UberXBackend.Entities.Enums.RideStatusEnum;
import com.nishintgoyal.UberXBackend.Entities.RideEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService
{
    RideEntity getRideById(Long rideId);

    void matchWithDriver(RideRequestDto rideRequestDto);

    RideEntity createNewRide(RideRequestDto rideRequestDto, DriverEntity driverEntity);

    RideEntity updateRideStatus(Long rideId, RideStatusEnum rideStatusEnum);

    Page<RideEntity> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

    Page<RideEntity> getAllRidesOfDriver(Long driverId,PageRequest pageRequest);


}
