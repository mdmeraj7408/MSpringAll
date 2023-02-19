package com.java.collection.injection;

import java.util.List;
import java.util.Map;
import java.util.Set;

//collection_config.xml

public class Employee {
	private String name;
	private List<String> phones;
	private Set<String> address;
	private Map<String,String> course;

	//--------------------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}

	//-----------------------------------------------
	public Employee(String name, List<String> phones, Set<String> address, Map<String, String> course) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.course = course;
	}

	//------------------------------------------------
	public Employee() {
		super();
	}

	//------------------------------------------------
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phones=" + phones + ", address=" + address + ", course=" + course + "]";
	}

}
