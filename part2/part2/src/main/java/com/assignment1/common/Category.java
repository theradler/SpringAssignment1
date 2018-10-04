package com.assignment1.common;

import org.springframework.beans.factory.annotation.Autowired;



public class Category {
	

	public Long id;
	public String name;
	@Autowired
    public Book book;

    public Category( ) {}
	public void setId(Long id) {
		this.id = id; 
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public void setBook(Book book) {
		this.book = book; 
	}
}