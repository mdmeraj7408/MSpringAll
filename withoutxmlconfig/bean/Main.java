package com.java.withoutxmlconfig.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new
                   AnnotationConfigApplicationContext(JavaConfig.class);
		Student student=context.getBean("getStudent",Student.class);
		      System.out.println(student);
		      student.toAdd();
		      student.looping();
	}

}
