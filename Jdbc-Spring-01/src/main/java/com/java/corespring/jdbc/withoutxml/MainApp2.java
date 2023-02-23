package com.java.corespring.jdbc.withoutxml;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.corespring.jdbc.bean.Student;
import com.java.corespring.jdbc.dao.StudentDao;

public class MainApp2 {
	public static void main(String[] args) {
		System.out.println("My programe started...");
		//spring JdbcTemplate
		ApplicationContext context=
				new AnnotationConfigApplicationContext(ConfigJdbc.class);
		Student.details();
//		//insert data
		StudentDao stdao=(StudentDao) context.getBean("studentDao");
//		Student st=new Student();
//		st.setId(4); 
//		st.setName("Nazmul");
//		st.setCourse("Kotlin");
//		st.setPhone(7776656);
//		st.setCity("SantKabir Nagar");
//		st.setEmail("mdnazmul@gmail.com");
//		int result = stdao.insert(st);
//		
//        System.out.println(st);


//		//update table
//	    StudentDao stdao=(StudentDao) context.getBean("studentDao");
//		Student st=new Student();
//		st.setId(4); 
//		st.setName("Kaif");
//		st.setCourse(".Net Frmwk");
//		st.setPhone(9887809);
//		st.setCity("Sk");
//		st.setEmail("mdKaifm@gmail.com");
//		int result = stdao.change(st);
//		System.out.println(result+"Row successfully Updated..");
//        System.out.println(st);
//        
		
		//delete row
		
//		int result = stdao.remove(5);
//		System.out.println(result+" Row Deleted....");
		
		
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
