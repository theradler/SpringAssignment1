package com.assignment1.common;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Category categoryByName = (Category)context.getBean("categoryByName"); 
        Category categoryByType = (Category)context.getBean("categoryByType");
        CategoryWithConstructor categoryByConstructor = (CategoryWithConstructor)context.getBean("categoryByConstructor"); 
        CategoryWithSetterInjection categoryBySetterInjection = (CategoryWithSetterInjection)context.getBean("categoryBySetterInjection");
        System.out.println("Hello Wolrd");
    }
}
