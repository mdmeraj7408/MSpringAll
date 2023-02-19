package com.java.consinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCons {
         public static void main(String[] args) {
			//@SuppressWarnings("resource")
			ApplicationContext context=new ClassPathXmlApplicationContext("com/java/consinjection/cons_config.xml");
		        Person p =(Person) context.getBean("p");
		        System.out.println(p);
		        
		        Person p1=(Person) context.getBean("P1");
		        System.out.println(p1);
         }
}
