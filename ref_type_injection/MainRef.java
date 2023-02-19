  package com.java.ref_type_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRef {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/java/ref_type_injection/config.xml");
                  
		           User1 u=(User1) context.getBean("aref");
		           
                   System.out.println(u.getA());
                   System.out.println(u.getU().getB());
                   System.out.println(u);
                   //p:schema
                   User1 user=(User1) context.getBean("aref1");
	
                   System.out.println(user.getA());
                   System.out.println(user.getU().getB());
                   System.out.println(user);
	}

}
