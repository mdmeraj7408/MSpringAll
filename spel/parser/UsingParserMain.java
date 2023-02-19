package com.java.spel.parser;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingParserMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/java/spel/parser/config.xml");
	Car car=context.getBean("car",Car.class);
		System.out.println(car);

	}

}
