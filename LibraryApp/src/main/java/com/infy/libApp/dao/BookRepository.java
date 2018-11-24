package com.infy.libApp.dao;

import org.springframework.data.repository.CrudRepository;
import com.infy.libApp.model.Books;


public interface BookRepository extends CrudRepository<Books, Integer>{

}
