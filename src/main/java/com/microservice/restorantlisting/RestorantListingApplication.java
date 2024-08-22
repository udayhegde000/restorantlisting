package com.microservice.restorantlisting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestorantListingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestorantListingApplication.class, args);
	}

}
