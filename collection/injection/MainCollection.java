package com.java.collection.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCollection {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/java/collection/injection/collection_config.xml");
                Employee emp =(Employee) context.getBean("emp1");
               System.out.println("Name"+"\t"+"Phone"+"\t"+"Address"+"\t"+"Course");
                System.out.println(emp.getName()+"\n"+emp.getPhones()+"\n"+emp.getAddress()+"\n"+emp.getCourse());
	}

}
