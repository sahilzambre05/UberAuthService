package com.example.UberServiceAuth.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler" , "bookings"})
public class Passenger extends BaseModel{
    private String name;

    private String email;

    private String password;

    private String phoneNumber;

    @OneToMany(mappedBy = "passenger")
    @Builder.Default
    private List<Booking> bookings = new ArrayList<>();
}
