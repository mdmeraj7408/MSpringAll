package com.java.book;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeMain {

	public static void main(String[] args) {
//		ApplicationContext context=new ClassPathXmlApplicationContext("com/java/book/book.xml");
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/java/book/book.xml");    
		 context.registerShutdownHook();
		 System.out.println("=======================================");
		          Book book = (Book) context.getBean("book");
                  System.out.println(book);
                 
                  System.out.println("=======================================");
                  Copy book2=(Copy) context.getBean("copy");
                  System.out.println(book2);
                  System.out.println("=======================================");
                  Institute ins=(Institute) context.getBean("ins");
                    System.out.println(ins);
                    System.out.println("=======================================");
	}

}
