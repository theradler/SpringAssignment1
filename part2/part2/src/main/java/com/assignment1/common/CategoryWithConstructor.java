package com.assignment1.common;

import org.springframework.beans.factory.annotation.Autowired;

public class CategoryWithConstructor {
	

	public Long id;
	public String name;
    public Book book;

    public CategoryWithConstructor(Long id, String name, Book book) {
    	this.id = id;
    	this.name = name;
    	this.book = book;
    }
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