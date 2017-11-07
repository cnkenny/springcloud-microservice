package com.itmuch.cloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class MicroserviceHystrixTurbine3Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceHystrixTurbine3Application.class, args);
	}
}
