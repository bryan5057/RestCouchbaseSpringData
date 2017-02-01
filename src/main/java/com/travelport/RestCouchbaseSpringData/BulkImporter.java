package com.travelport.RestCouchbaseSpringData;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

public class BulkImporter {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	CommandLineRunner initData(TravelerRepository travelerRepository) {
		return args -> {
			System.out.println("Running initData from BulkImporter");
			travelerRepository.save(new Traveler("Ringo", "Starr"));
			travelerRepository.save(new Traveler("John", "Lennon"));
		};
	}
}
