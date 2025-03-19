package com.nishintgoyal.UberXBackend.Services;


import com.nishintgoyal.UberXBackend.DTO.DriverDto;
import com.nishintgoyal.UberXBackend.DTO.SignUpDto;
import com.nishintgoyal.UberXBackend.DTO.UserDto;

public interface AuthService
{
    String login(String email,String password);

    UserDto signup(SignUpDto signUpDto);

    DriverDto onboardNewDriver(Long userId);

}
