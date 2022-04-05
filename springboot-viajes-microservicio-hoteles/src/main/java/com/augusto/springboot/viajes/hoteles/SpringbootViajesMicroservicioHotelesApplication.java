package com.augusto.springboot.viajes.hoteles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringbootViajesMicroservicioHotelesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootViajesMicroservicioHotelesApplication.class, args);
	}

}
