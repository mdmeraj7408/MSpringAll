package com.java.addition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
          
		//"com/java/addition/ov_cnf.xml");
           ApplicationContext context=new ClassPathXmlApplicationContext("com/java/addition/ov_cnf.xml");
                 Addition ad1=(Addition)context.getBean("add1");
                     ad1.doSum();
//               Addition ad2=(Addition)context.getBean("add2");
//               ad2.doSum();
	}

	
}
