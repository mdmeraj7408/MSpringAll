package com.java.autowired.annotation.qualifire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWireMain {
     public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/java/autowired/annotation/qualifire/book4.xml");
		System.out.println("---------------------------------------------------");
	
	   Emp emp= context.getBean("emp1",Emp.class);
       System.out.println(emp);
       System.out.println("---------------------------------------------------");
 }
}
