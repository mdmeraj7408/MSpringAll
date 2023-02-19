package com.java.addition;

public class Addition {
      private int a;
      private int b;
	public Addition(int a, int b) {
		
		this.a = a;
		this.b = b;
		System.out.println("int:int");
	}
	//overloaded constructor
	public Addition(double a,double b) {
		
		this.a =(int) a;
		this.b =(int) b;
		System.out.println("double:double");
	}
	//Ambiguity
	public Addition(String a,String b) {
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("String:String");
	}
      public void doSum()
      {
    	  System.out.println("value of:"+this.a);
    	  System.out.println("value of:"+this.b);
    	  System.out.println("Sum Of:"+this.a+this.b);
      }
}
