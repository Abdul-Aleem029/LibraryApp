package com.infy.libApp.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.infy.libApp.document.Books;

public interface BookRepository extends MongoRepository<Books, Integer>{

}
