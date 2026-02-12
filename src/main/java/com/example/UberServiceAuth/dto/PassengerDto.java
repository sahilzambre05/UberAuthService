package com.example.UberServiceAuth.dto;


import com.example.UberServiceAuth.models.Passenger;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class PassengerDto {
    private String id;

    private String name;

    private String email;

    private String password; //encrypted

    private String phoneNumber;

    private Date createdAt;

    public static PassengerDto from(Passenger p) {
        return PassengerDto.builder()
                .id(p.getId().toString())
                .createdAt(p.getCreatedAt())
                .email(p.getEmail())
                .password(p.getPassword())
                .phoneNumber(p.getPhoneNumber())
                .name(p.getName())
                .build();
    }
}
