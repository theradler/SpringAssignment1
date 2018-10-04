package com.assignment1.common;

import java.util.List;
import java.util.Set;
import java.util.Map;

public class Collection {
	
	
	private List<Book> bookList;
	private Set<Book> bookSet;
	private Map<Integer, Book> bookMap;
	
	
	public Collection () {} 
	public Collection(List<Book> bookList, Set<Book> bookSet, Map<Integer, Book>bookMap) {
		this.bookList = bookList;
		this.bookSet  = bookSet;
		this.bookMap = bookMap; 
		
	}

	public Map<Integer, Book> getBookMap() {
		return bookMap;
	}
	
	public void  setBookMap(Map<Integer, Book> bookMap) {
		this.bookMap = bookMap; 
	}
	
	public void printBookMap() {
		for(Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
			Book book = entry.getValue();
			book.printBook();
		}
	}
	
	public Set<Book> getBookSet() {
		return bookSet;
	}
	
	public void setBookSet(Set<Book> bookSet) {
		this.bookSet = bookSet;
	}
	
	public void printBookSet() {
		for (Book book : bookSet) {
			book.printBook();			
		}
	}
	
	
	public List<Book> getBookList() {
		return bookList;
	}
	
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	public void printBookList() {
		for (Book book : bookList ) {
			book.printBook(); 
		}
	}

	

}
