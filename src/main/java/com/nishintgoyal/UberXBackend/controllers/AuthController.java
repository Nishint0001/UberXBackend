package com.nishintgoyal.UberXBackend.controllers;

import com.nishintgoyal.UberXBackend.DTO.SignUpDto;
import com.nishintgoyal.UberXBackend.DTO.UserDto;
import com.nishintgoyal.UberXBackend.Services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    UserDto signUp(@RequestBody SignUpDto signupDto)
    {
        return authService.signup(signupDto);
    }

}
