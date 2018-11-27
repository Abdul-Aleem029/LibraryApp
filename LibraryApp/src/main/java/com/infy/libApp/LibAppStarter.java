package com.infy.libApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.infy.libApp.dao.BookRepository;
import com.infy.libApp.document.Books;


@EnableMongoRepositories(basePackages= "com.infy.libApp.dao")
@SpringBootApplication(scanBasePackages = "com.infy.libApp.*")
@EntityScan("com.infy.libApp.document")
public class LibAppStarter extends SpringBootServletInitializer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(LibAppStarter.class, args);
	}
	
	
	CommandLineRunner commandLineRunner(BookRepository bookRepository) 
	{
		return strings ->{
			bookRepository.save(new Books(1, "Jungle Book", "Rudyard Kipling", "Available"));
			bookRepository.save(new Books(2, "Lion King", "Chris Sanders", "Available"));
		};
	}

}

