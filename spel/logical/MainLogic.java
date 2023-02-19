package com.java.spel.logical;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/java/spel/config.xml");
	Logical lg=context.getBean("logical",Logical.class);
	System.out.println(lg.isAnd()+"\n"+lg.isNot());
}
}
