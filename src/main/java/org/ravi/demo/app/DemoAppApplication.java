package org.ravi.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan(basePackages = "org.ravi.demo.app.service.ProductService.class, org.ravi.demo.app.controller.ProductContorller.class")
@EnableJpaRepositories("org.ravi.demo.app.repository.ProductRepository.class")
@EntityScan("org.ravi.demo.app.model")
@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);
	}

}
