package com.java.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoTypeTest {

	public static void main(String[] args) {
		
ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/java/stereotype/stereo_confi.xml");
//Student st=applicationContext.getBean("student",Student.class);
//No bean named 'student' available
Student st=applicationContext.getBean("ob",Student.class);
System.out.println(st.hashCode());
Student st2=applicationContext.getBean("ob",Student.class);
System.out.println(st2.hashCode());
Teacher th=applicationContext.getBean("pro",Teacher.class);
System.out.println(th.hashCode());
	}

}
