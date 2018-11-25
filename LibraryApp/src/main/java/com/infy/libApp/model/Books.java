package com.infy.libApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books 
{
	@Id
	private int id;
	private String name;
	private String author;
	private String availability;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int bookId) {
		this.id = bookId;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
}
