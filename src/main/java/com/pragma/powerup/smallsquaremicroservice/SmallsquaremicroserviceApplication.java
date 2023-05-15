package com.pragma.powerup.smallsquaremicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SmallsquaremicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmallsquaremicroserviceApplication.class, args);
	}

}
