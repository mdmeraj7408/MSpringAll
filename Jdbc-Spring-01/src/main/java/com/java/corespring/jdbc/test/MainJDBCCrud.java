package com.java.corespring.jdbc.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.corespring.jdbc.bean.Student;
import com.java.corespring.jdbc.dao.StudentDao;


public class MainJDBCCrud {
public static void main(String[] args) {
	System.out.println("My programe started...");
	//spring JdbcTemplate
	ApplicationContext context=
			new ClassPathXmlApplicationContext("com/java/corespring/jdbc/test/config.xml");
	
	Student.details();
	//insert data
	StudentDao stdao=(StudentDao) context.getBean("studentDaoImpl");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Boolean go=true;
	while(go)
	{

		System.out.println("Press 1 For Save Deatils");
		System.out.println("Press 2 For Select Details By Id");
		System.out.println("Perss 3 For Select All");
		System.out.println("Press 4 For Delete ");
		System.out.println("Press 5 For Updating ");
		System.out.println("Press 6 For Exit");

		try {
			int i = Integer.parseInt(br.readLine());
			switch(i)
			{
			case 1:
				
				
				System.out.println("Enter Student Name:");
				String name = br.readLine();
				
				System.out.println("Enter Student COurse");
				String course=br.readLine();
				
				System.out.println("Enter Student phone:");
				long phone=Long.parseLong(br.readLine());
				
				System.out.println("Enter Student City:");
				String city = br.readLine();
				System.out.println("Enter Student Email:");
				String email= br.readLine();
				Student st=new Student();
				st.setName(name);
				st.setCourse(course);
				st.setPhone(phone);
				st.setCity(city);
				st.setEmail(email);
				
				int insert = stdao.insert(st);
				System.out.println(insert+":Svaed.");
				break;
			case 2:
				System.out.println("Enter User Id:");
				int userid=Integer.parseInt(br.readLine());
			   	Student student = stdao.getStudent(userid);
			
			    
			System.out.println(student.getId()+"\t"+student.getName()+"\t"+student.getCourse()+"\t"+student.getPhone()+"\t"+student.getCity()+"\t"+student.getEmail());
				
				break;
				
			case 3:

				List<Student> all = stdao.getAll();
				
				for(Student s:all)
				{
					System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getCourse()+"\t"+s.getPhone()+"\t"+s.getCity()+"\t"+s.getEmail());
				}
				break;
			case 4:
				System.out.println("Enter User Id:");
				int uid=Integer.parseInt(br.readLine());
				int result = stdao.remove(uid);
				System.out.println(result+": deleted ");
				break;
			case 5:
				System.out.println("Enter User Id:");
				int id=Integer.parseInt(br.readLine());
				System.out.println("Enter Student Name:");
				String name1 = br.readLine();
				
				System.out.println("Enter Student COurse");
				String course1=br.readLine();
				
				System.out.println("Enter Student phone:");
				long phone1=Long.parseLong(br.readLine());
				
				System.out.println("Enter Student City:");
				String city1 = br.readLine();
				System.out.println("Enter Student Email:");
				String email1= br.readLine();
				Student st1=new Student();
				st1.setName(name1);
				st1.setCourse(course1);
				st1.setPhone(phone1);
				st1.setCity(city1);
				st1.setEmail(email1);
				st1.setId(id);
				int change = stdao.change(st1);
				System.out.println(change+":Changed");
				break;
			case 6:
				go=false;
				break;
			}

		} catch (Exception e) {
			System.out.println("Invalid Input Try Again");
			e.printStackTrace();
		}
	}
	System.out.println("Thank you for using My Application");
	System.out.println("See you soon!!");
}
}
