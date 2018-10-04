package com.assignment1.common;

public class Book {
	
	public Long id;
	public String isbn;
	public String title;
	public Float price; 
	

	public void setId(Long id) {
		this.id = id;		
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPrice(Float price) {
		this.price = price;
	}
	
	public void printBook() {
		System.out.println("Id: " + id + "\n"
				+ "Isbn: " + isbn + "\n"
				+ "Title: " + title + "\n"
				+ "Price: " + price 
 				);
	}
}