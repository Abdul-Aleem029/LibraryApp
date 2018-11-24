package com.infy.libApp.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.infy.libApp.dao.BookRepository;

import javax.sql.DataSource;


@SpringBootApplication(scanBasePackages = "com.infy.libApp.*")
@EntityScan("com.infy.libApp.model")
public class LibAppStarter extends SpringBootServletInitializer {

	 @Autowired
	    DataSource dataSource;
	 
	    @Autowired
	    BookRepository bookRepository;
	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(LibAppStarter.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(LibAppStarter.class, args);
	}

}