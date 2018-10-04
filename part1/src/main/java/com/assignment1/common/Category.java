package com.assignment1.common;

import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Category {
	
	public Long id;
	public String name;
	public Set<Book>booksSet;
	public List<Book>booksList;
	public Map<String, Book> booksMap;
	
	public Category() {};
	public Category(List<Book> bookList, Set<Book> bookSet, Map<String, Book> bookMap, Long id, String name) {
		this.booksList = bookList;
		this.booksSet = bookSet;
		this.booksMap = bookMap;
		this.id = id;
		this.name = name; 
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printCategory() {
		System.out.println("Id: " + id + " Category Name " + name);
	}
 	
	public Map<String, Book> getBookMap() {
		return booksMap;
	}
	
	public void  setBookMap(Map<String, Book> bookMap) {
		this.booksMap = bookMap; 
	}
	
	public void printBookMap() {
		for(Entry<String, Book> entry : booksMap.entrySet()) {
			Book book = entry.getValue();
			book.printBook();
		}
	}
	
	public Set<Book> getBookSet() {
		return booksSet;
	}
	
	public void setBookSet(Set<Book> bookSet) {
		this.booksSet = bookSet;
	}
	
	public void printBookSet() {
		for (Book book : booksSet) {
			book.printBook();			
		}
	}
	
	
	public List<Book> getBookList() {
		return booksList;
	}
	
	public void setBookList(List<Book> bookList) {
		this.booksList = bookList;
	}
	
	public void printBookList() {
		for (Book book : booksList ) {
			book.printBook(); 
		}
	}

	
	

}
