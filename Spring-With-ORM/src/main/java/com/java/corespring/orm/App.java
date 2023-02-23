package com.java.corespring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.corespring.orm.dao.UserDao;
import com.java.corespring.orm.entities.User;

public class App 
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );

		ApplicationContext   context=new ClassPathXmlApplicationContext("config.xml");
		UserDao userdao=context.getBean("userDao",UserDao.class);
		/*User user=new User(2,"Junaid","Basti");
                            int result = userdao.insert(user);
                           System.out.println(result);*/
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Id"+"/t"+"Name"+"/t"+"City");
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
					System.out.println("Enter User Id:");
					int id=Integer.parseInt(br.readLine());
					System.out.println("Enter User Name:");
					String name = br.readLine();
					System.out.println("Enter User City");
					String city = br.readLine();
					User user= new User();
					user.setId(id);
					user.setName(name);
					user.setCity(city);
					int insert = userdao.insert(user);
					System.out.println(insert+"User Added..");
					break;
				case 2:
					System.out.println("Enter User Id:");
					int userid=Integer.parseInt(br.readLine());
				    User user3=	userdao.getById(userid);
				
				    
						System.out.println(user3.getId()+"\t"+user3.getName()+"\t"+user3.getCity());
					
					break;
					
				case 3:

					List<User> allDetails = userdao.getAllDetails();
					System.out.println("Id"+"\t"+"Name"+"\t"+"City");
					System.out.println("=="+"\t"+"==="+"\t"+"=====");
					for(User u:allDetails)
					{
						System.out.println(u.getId()+"\t"+u.getName()+"\t"+u.getCity());
					}
					break;
				case 4:
					System.out.println("Enter User Id:");
					int uid=Integer.parseInt(br.readLine());
					int result = userdao.deleteUserDeatils(uid);
					System.out.println(result+": deleted ");
					break;
				case 5:
					System.out.println("Enter User Id:");
					int idm=Integer.parseInt(br.readLine());
					System.out.println("Chang User Name:");
					String uname = br.readLine();
					System.out.println("change User City");
					String ucity = br.readLine();
					User user1= new User();
					user1.setId(idm);
					user1.setName(uname);
					user1.setCity(ucity);
					User res = userdao.updateData(user1);
					System.out.println(res+"User Added..");
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
