package com.saran;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient
public class EmpProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpProducerApplication.class, args);
	}

}
