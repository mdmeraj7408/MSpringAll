package com.java.book;

public class Book {
	private String bName;
	private double price;
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		System.out.println("Setting Values");
		this.price = price;
	}
	public Book() {
		super();

	}
	@Override
	public String toString() {
		return "Book [bName=" + bName + ", price=" + price + "]";
	}
//	public void   init()
//	{
//		System.out.println("Init Methods");
//	}
//	public void destroy()
//	{
//		System.out.println("Destroy Methods");
//	}
	public void   hey()
	{
		System.out.println("Init Methods:Hey!How Are You");
	}
	public void bye()
	{
		System.out.println("Destroy Methods:bye bye I am going to die");
	}
}
