package com.example.UberServiceAuth.repositories;

import com.example.UberServiceAuth.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Long> {
}
