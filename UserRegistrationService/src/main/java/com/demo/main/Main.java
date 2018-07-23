package com.demo.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Main {

	private static Logger logger = LogManager.getLogger(Main.class);
	
	public static void main(String[] args) {
		logger.info("Starting Spring Boot application..");
		SpringApplication.run(Main.class, args);
	}
}
