package com.springboot.viajes.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SptingbootViajesGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SptingbootViajesGatewayServerApplication.class, args);
	}

}
