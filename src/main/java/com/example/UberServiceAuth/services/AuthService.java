package com.example.UberServiceAuth.services;

import com.example.UberServiceAuth.dto.PassengerDto;
import com.example.UberServiceAuth.dto.PassengerSignupRequestDto;
import com.example.UberServiceAuth.models.Passenger;
import com.example.UberServiceAuth.repositories.PassengerRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final PassengerRepository passengerRepository;

    public AuthService(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    public PassengerDto signUpPassenger(PassengerSignupRequestDto passengerSignupRequestDto){
        Passenger passenger = Passenger.builder()
                .email(passengerSignupRequestDto.getEmail())
                .name(passengerSignupRequestDto.getName())
                .password(passengerSignupRequestDto.getPassword())
                .phoneNumber(passengerSignupRequestDto.getPhoneNumber())
                .build();

        Passenger newPassenger = passengerRepository.save(passenger);

        return PassengerDto.from(newPassenger);
    }
}
