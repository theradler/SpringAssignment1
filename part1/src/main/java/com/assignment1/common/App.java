package com.assignment1.common;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List; 

public class App {

	public static void main( String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		//Collection collection = (Collection)context.getBean("collection");	
		Category category = (Category) context.getBean("Category");
		category.printCategory();
		category.printBookMap();
		category.printCategory();
		category.printBookList();
		category.printCategory();
		category.printBookSet();
		
	}
}
