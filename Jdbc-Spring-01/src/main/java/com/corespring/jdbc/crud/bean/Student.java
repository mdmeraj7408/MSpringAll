package com.corespring.jdbc.crud.bean;

public class Student {
private int id;
private String name;
private String course;
private long phone;
private String city;
private String email;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Student(int id, String name, String course, long phone, String city, String email) {
	super();
	this.id = id;
	this.name = name;
	this.course = course;
	this.phone = phone;
	this.city = city;
	this.email = email;
}
public Student() {
	super();
	
}
public static void details ()
{
	System.out.println("id"+"\t" +"name"+"\t"+"course"+"\t"+"phone"+"\t\t"+"city"+"\t\t"+"email");
}
@Override
public String toString() {
	
	return id +"\t" + name + "\t" + course + "\t" + phone + "\t\t" + city
			+ "\t\t" + email ;
}

}
