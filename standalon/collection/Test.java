package com.java.standalon.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/java/standalon/collection/st_collection_cnf.xml");
		Person person=(Person) context.getBean("person1",Person.class);
		System.out.println(person);
		System.out.println(person.getFreinds().getClass().getName());
		System.out.println("---------------------------------------------------------------------");
		System.out.println(person.getFeeStructure());
		System.out.println(person.getFeeStructure().getClass().getName());
		System.out.println("---------------------------------------------------------------------");
		System.out.println(person.getProperties());
		
	}

}
