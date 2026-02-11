package com.example.UberServiceAuth.dto;


import lombok.*;


//we need getter setter because we will get input in raw json format which we can convert into java object for our logic implementation
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class PassengerSignupRequestDto {

    private String email;

    private String password;

    private String phoneNumber;

    private String name;


}
