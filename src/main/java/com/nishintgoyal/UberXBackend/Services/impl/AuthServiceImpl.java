package com.nishintgoyal.UberXBackend.Services.impl;

import com.nishintgoyal.UberXBackend.DTO.DriverDto;
import com.nishintgoyal.UberXBackend.DTO.SignUpDto;
import com.nishintgoyal.UberXBackend.DTO.UserDto;
import com.nishintgoyal.UberXBackend.Entities.Enums.RoleEnum;
import com.nishintgoyal.UberXBackend.Entities.UserEntity;
import com.nishintgoyal.UberXBackend.Repositories.UserRepository;
import com.nishintgoyal.UberXBackend.Services.AuthService;
import com.nishintgoyal.UberXBackend.Services.RiderService;
import com.nishintgoyal.UberXBackend.exceptions.RunTimeConflictException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService
{
    private final ModelMapper modelMapper;
    private final UserRepository userRepository;
    private final RiderService riderService;

    @Override
    public String login(String email, String password)
    {
    return "";
    }

    @Override
    public UserDto signup(SignUpDto signUpDto)
    {
        userRepository.findByEmail(signUpDto.getEmail()).orElseThrow(()->new RunTimeConflictException("Cannot SignUp User Already Exist"));

        UserEntity userEntity=modelMapper.map(signUpDto, UserEntity.class);
        userEntity.setRoles(Set.of(RoleEnum.RIDER));
        UserEntity savedEntity=userRepository.save(userEntity);

        //create user related entities
        riderService.createNewRider(savedEntity);

        return modelMapper.map(savedEntity, UserDto.class);
    }

    @Override
    public DriverDto onboardNewDriver(Long userId)
    {
        return null;
    }
}
