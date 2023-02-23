package com.java.corespring.orm.entities;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class User {
@Id
@Column(name="user_id")
private int id;
@Column(name="user_name")
private String name;
@Column(name="user_city")
private String city;
//default cons
public User() {
	
}
//parameterized
public User(int id, String name, String city) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
}
//setter/getter
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}


}
