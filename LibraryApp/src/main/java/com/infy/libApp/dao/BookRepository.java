package com.infy.libApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.libApp.model.Books;

public interface BookRepository extends JpaRepository<Books, Integer>{

}
