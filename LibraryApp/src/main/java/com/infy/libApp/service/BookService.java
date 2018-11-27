package com.infy.libApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.libApp.dao.BookRepository;
import com.infy.libApp.document.Books;

@Service
public class BookService 
{
	@Autowired
	BookRepository bookRepository;
	
	
	public List<Books> getAllBooks()
	{
		List<Books> books = new ArrayList<>();
		bookRepository.findAll().forEach(books::add);
		return books;
	}
}
