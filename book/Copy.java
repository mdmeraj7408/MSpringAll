package com.java.book;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Copy implements InitializingBean,DisposableBean {
     private String name;
     private double price;
     
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Copy() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Copy [name=" + name + ", price=" + price + "]";
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init Methods:Generate");
		
	}
	public void destroy() throws Exception {
		System.out.println("Destroy Bean:Generated");
		
	}
     
     
}
