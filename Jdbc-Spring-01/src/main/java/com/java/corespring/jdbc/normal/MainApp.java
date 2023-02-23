package com.java.corespring.jdbc.normal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("My programe started...");
		//spring JdbcTemplate
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/java/corespring/jdbc/test/config.xml");
		JdbcTemplate jdbcTemplate=context.getBean("jdbcTemplate",JdbcTemplate.class);

         //query for inserting data 
		String query="insert into student(id,name,course,phone,city,email)values(?,?,?,?,?,?)";
		int result=jdbcTemplate.update(query,2,"Junaid","html",7855655,"Basti","Junaid@gmail.com");
		System.out.println("record inserted of no:"+result);

	}
}
