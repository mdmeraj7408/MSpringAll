package com.java.withoutxmlconfig.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConfig {
	@Bean
   public Student getStudent()
   {
	   //creating a new student object
	   Student student=new Student();
	   return student;
   }
}
