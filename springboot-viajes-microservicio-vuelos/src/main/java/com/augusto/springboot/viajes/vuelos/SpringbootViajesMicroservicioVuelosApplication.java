package com.augusto.springboot.viajes.vuelos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringbootViajesMicroservicioVuelosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootViajesMicroservicioVuelosApplication.class, args);
	}

}
