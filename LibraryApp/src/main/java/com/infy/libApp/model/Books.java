package com.infy.libApp.model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books 
{
	@Id
	private int id;
	private String name;
	private String author;
	private Date publishedDate;
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
	public Date getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int bookId) {
		this.id = bookId;
	}
	
	
}
