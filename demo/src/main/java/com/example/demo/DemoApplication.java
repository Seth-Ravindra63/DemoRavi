package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.demo.service.DemoService;

@SpringBootApplication
public class DemoApplication {
	private static final Logger logger = LogManager.getLogger(DemoApplication.class);

	// @Autowired
	// private DemoService demoService;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

		/*
		 * DemoService demoService = new DemoService();
		 * 
		 * logger.trace("Trace Message!"); logger.debug("Demo debug");
		 * logger.info("Demo info"); logger.error("demo error");
		 * 
		 * demoService.testString();
		 */

	}

}
