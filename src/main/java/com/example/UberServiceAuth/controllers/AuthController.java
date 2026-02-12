package com.example.UberServiceAuth.controllers;


import com.example.UberServiceAuth.dto.PassengerDto;
import com.example.UberServiceAuth.dto.PassengerSignupRequestDto;
import com.example.UberServiceAuth.services.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private AuthService authService;

    private AuthController(AuthService authService){
        this.authService = authService;
    }

    @PostMapping("/signup/passenger")
    public ResponseEntity<PassengerDto> signUp(@RequestBody PassengerSignupRequestDto passengerSignupRequestDto){
        PassengerDto response = authService.signUpPassenger(passengerSignupRequestDto);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/signin/passenger")
    public ResponseEntity<?> signIn(){

        return new ResponseEntity<>(10, HttpStatus.CREATED);
    }

}
