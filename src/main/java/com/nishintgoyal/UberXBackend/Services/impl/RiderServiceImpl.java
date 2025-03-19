package com.nishintgoyal.UberXBackend.Services.impl;


import com.nishintgoyal.UberXBackend.DTO.DriverDto;
import com.nishintgoyal.UberXBackend.DTO.RideDto;
import com.nishintgoyal.UberXBackend.DTO.RideRequestDto;
import com.nishintgoyal.UberXBackend.DTO.RiderDto;
import com.nishintgoyal.UberXBackend.Entities.Enums.RideRequestStatusEnum;
import com.nishintgoyal.UberXBackend.Entities.RideRequestEntity;
import com.nishintgoyal.UberXBackend.Entities.RiderEntity;
import com.nishintgoyal.UberXBackend.Entities.UserEntity;
import com.nishintgoyal.UberXBackend.Repositories.RideRequestRepository;
import com.nishintgoyal.UberXBackend.Repositories.RiderRepository;
import com.nishintgoyal.UberXBackend.Services.RiderService;
import com.nishintgoyal.UberXBackend.Strategies.DriverMatchingStrategy;
import com.nishintgoyal.UberXBackend.Strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RiderServiceImpl implements RiderService
{
    private final ModelMapper modelMapper;
    private final RideRequestRepository rideRequestRepository;
    private final RideFareCalculationStrategy rideFareCalculationStrategy;
    private final DriverMatchingStrategy driverMatchingStrategy;
    private final RiderRepository riderRepository;

    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto)
    {
        RideRequestEntity rideRequestEntity=modelMapper.map(rideRequestDto, RideRequestEntity.class);

        rideRequestEntity.setRideRequestStatusEnum(RideRequestStatusEnum.PENDING);

        Double fare=rideFareCalculationStrategy.calculateFare(rideRequestEntity);
        rideRequestEntity.setFare(fare);

        RideRequestEntity savedEntity= rideRequestRepository.save(rideRequestEntity);

        driverMatchingStrategy.findMatchingDriver(rideRequestEntity);

        return modelMapper.map(savedEntity, RideRequestDto.class);
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }

    @Override
    public RiderEntity createNewRider(UserEntity userEntity)
    {
        RiderEntity rider=RiderEntity
                .builder()
                .userEntity(userEntity)
                .rating(4.0)
                .build();

        return riderRepository.save(rider);
    }
}
