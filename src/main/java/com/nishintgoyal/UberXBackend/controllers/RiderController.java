package com.nishintgoyal.UberXBackend.controllers;


import com.nishintgoyal.UberXBackend.DTO.RideRequestDto;
import com.nishintgoyal.UberXBackend.Services.RiderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rider")
@RequiredArgsConstructor
public class RiderController {

    private final RiderService riderService;

    @PostMapping("/requestRide")
    public ResponseEntity<RideRequestDto> requestRide(@RequestBody RideRequestDto rideRequestDto)
    {
        return ResponseEntity.ok(riderService.requestRide(rideRequestDto));
    }

}
