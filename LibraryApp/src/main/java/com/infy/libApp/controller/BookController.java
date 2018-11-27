package com.infy.libApp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.infy.libApp.document.Books;
import com.infy.libApp.service.BookService;

@Controller
public class BookController {

	@Autowired
	BookService service;

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) 
	{
		List<Books> books = service.getAllBooks();
		model.put("Books", books);
		return "welcome";
	}

}