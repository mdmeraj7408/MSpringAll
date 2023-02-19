package com.java.corespring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("com/java/corespring/config2.xml");
		Student st1=(Student) ap.getBean("student1");
		System.err.println(st1);
		Student st2=(Student) ap.getBean("student2");
		//with getter method to use get data from bean class 
		System.err.println(st2.getId()+"\t"+st2.getName()+"\t"+st2.getAddress());
		Student st3=(Student) ap.getBean("student3");
		System.out.println(st3);
	}

}
