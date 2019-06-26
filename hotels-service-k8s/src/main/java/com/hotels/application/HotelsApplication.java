package com.hotels.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
 
@SpringBootApplication
@EnableSwagger2
public class HotelsApplication {
	private static final Logger logger = LoggerFactory.getLogger(HotelsApplication.class);
	@Profile({"k8s"})
	public static void main(String[] args) {
		SpringApplication.run(HotelsApplication.class, args);
	}
}
