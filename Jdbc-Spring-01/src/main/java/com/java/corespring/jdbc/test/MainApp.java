package com.java.corespring.jdbc.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.corespring.jdbc.bean.Student;
import com.java.corespring.jdbc.dao.StudentDao;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("My programe started...");
		//spring JdbcTemplate
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/java/corespring/jdbc/test/config.xml");
		
		Student.details();
		//insert data
		StudentDao stdao=(StudentDao) context.getBean("studentDaoImpl");
		Student st=new Student();
		st.setId(5); 
		st.setName("Rahim");
		st.setCourse("Python");
		st.setPhone(97866565);
		st.setCity("Basti");
		st.setEmail("mdRahim@gmail.com");
		int result = stdao.insert(st);
		
        System.out.println(st);


		//update table
		/*StudentDao stdao=(StudentDao) context.getBean("studentDaoImpl");
		Student st=new Student();
		st.setId(3); 
		st.setName("Waseem");
		st.setCourse(".Net Frmwk");
		st.setPhone(7366366);
		st.setCity("Basti");
		st.setEmail("mdWaseem@gmail.com");
		int result = stdao.insert(st);
		System.out.println(result+"Row successfully Updated..");
        System.out.println(st);
        */
		
		//delete row
		
		//int result = stdao.remove(3);
		//System.out.println(result+" Row Deleted....");
		
		
		//select details
		//Student student = stdao.getStudent(1);
		//System.out.println(student);
		//select all 
	
		List<Student> all = stdao.getAll();
		for(Student s:all)
		{
			System.out.println(s);
		}
	}
}
