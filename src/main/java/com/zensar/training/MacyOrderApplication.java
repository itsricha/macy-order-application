package com.zensar.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MacyOrderApplication {
	
	@Bean
	@Scope(scopeName = "prototype")
	public RestTemplate restTemplate() {
		System.out.println("Creating rest object....");
		return new RestTemplate();
	}

	public static void main(String[] args) {
		System.out.println("Run main class....");
		SpringApplication.run(MacyOrderApplication.class, args);
	}
	


}
