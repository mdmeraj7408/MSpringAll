package com.java.spel.invoke.variable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext context=new 
			ClassPathXmlApplicationContext("com/java/spel/invoke/variable/config.xml");
	Root root=context.getBean("root",Root.class);
	System.out.println(root);
}
}
