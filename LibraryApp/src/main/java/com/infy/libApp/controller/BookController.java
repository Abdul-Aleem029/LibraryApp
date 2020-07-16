package com.infy.libApp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.File;

import com.infy.libApp.model.Books;
import com.infy.libApp.service.BookService;

@Controller
public class BookController {

	@Autowired
	BookService service;
	
	@Value("${welcome.message}")
	private String configFilePath;
	

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) 
	{
		File file = new File(configFilePath);
		List<Books> books = service.getAllBooks();
		for (Books books2 : books) {
			System.out.println(books2.getId());
		}
		model.put("Books", books);
		return "welcome";
	}

}
