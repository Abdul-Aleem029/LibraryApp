package com.infy.libApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages= "com.infy.libApp.dao")
@SpringBootApplication(scanBasePackages = "com.infy.libApp.*")
@EntityScan("com.infy.libApp.model")
public class LibAppStarter extends SpringBootServletInitializer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(LibAppStarter.class, args);
	}

}