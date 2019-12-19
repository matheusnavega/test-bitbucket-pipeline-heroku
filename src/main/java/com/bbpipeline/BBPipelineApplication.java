package com.bbpipeline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BBPipelineApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(BBPipelineApplication.class);
		app.run();
	}

	public void run(String... args) throws Exception {

		logger.info("#############################################################");
		logger.info("It's been started... ");
		logger.info("#############################################################");

	}

}
