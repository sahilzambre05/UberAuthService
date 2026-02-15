package com.example.UberServiceAuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EntityScan("com.example.UberEntityService.models")
public class UberServiceAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(UberServiceAuthApplication.class, args);
	}

}
