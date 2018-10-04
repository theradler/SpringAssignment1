package com.assignment1.common;

import org.springframework.beans.factory.annotation.Autowired;



public class CategoryWithSetterInjection {
	

	public Long id;
	public String name;

	public Book book;

    public CategoryWithSetterInjection( ) {}
	public void setId(Long id) {
		this.id = id; 
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	@Autowired
	public void setBook(Book book) {
		this.book = book; 
	}
}