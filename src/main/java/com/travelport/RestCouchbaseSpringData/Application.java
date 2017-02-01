
package com.travelport.RestCouchbaseSpringData;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
//	@Bean
//	CommandLineRunner initData(TravelerRepository travelerRepository) {
//		return args -> {
//			travelerRepository.save(new Traveler("Bill", "Smith"));
//			travelerRepository.save(new Traveler("Robin", "Smith"));
//		};
//	}
}
