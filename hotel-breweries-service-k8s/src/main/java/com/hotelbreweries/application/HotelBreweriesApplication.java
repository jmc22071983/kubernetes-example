package com.hotelbreweries.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Profile;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableFeignClients
@EnableSwagger2
public class HotelBreweriesApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(HotelBreweriesApplication.class);
	
	@Profile({"k8s"})
	public static void main(String[] args) {
		SpringApplication.run(HotelBreweriesApplication.class, args);
	}
}