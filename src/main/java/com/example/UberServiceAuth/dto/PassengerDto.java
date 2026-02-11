package com.example.UberServiceAuth.dto;


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
}
