package com.java.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWireMain {
     public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/java/autowire/book2.xml");
		System.out.println("---------------------------------------------------");
		System.out.println("By Name Autowiring");
		System.out.println("---------------------------------------------------");
	   Emp emp= context.getBean("emp1",Emp.class);
	   System.out.println(emp);
	   System.out.println("---------------------------------------------------");
	   System.out.println("By Type AutoWiring");
	   System.out.println("---------------------------------------------------");
	   Emp emp1=context.getBean("emp2",Emp.class);
	   System.out.println(emp1);
	   System.out.println("---------------------------------------------------");
	   System.out.println("By Constructor AutoWiring");
	   System.out.println("---------------------------------------------------");
	   Emp emp2=context.getBean("emp3",Emp.class);
	   System.out.println(emp2);
     }
}
