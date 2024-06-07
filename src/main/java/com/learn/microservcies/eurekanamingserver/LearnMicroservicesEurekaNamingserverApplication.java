package com.learn.microservcies.eurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LearnMicroservicesEurekaNamingserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnMicroservicesEurekaNamingserverApplication.class, args);
	}

}
