package com.assignment1.common;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List; 

public class App {

	public static void main( String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		Collection collection = (Collection)context.getBean("collection");	
		System.out.print("----Printing Values From List-----");
		collection.printBookList();
		System.out.print("----Printing Values From Map-----");
		collection.printBookMap();
		System.out.print("----Printing Values From Set-----");
		collection.printBookSet();
		
		
	}
}
