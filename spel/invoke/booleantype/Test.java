package com.java.spel.invoke.booleantype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.spel.invoke.variable.Root;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new 
				ClassPathXmlApplicationContext("com/java/spel/invoke/booleantype/config.xml");
		Type type=context.getBean("type",Type.class);
		System.out.println(type);

	}

}
