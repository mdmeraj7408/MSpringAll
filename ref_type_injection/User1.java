package com.java.ref_type_injection;

public class User1 {
     private int a;
     User2 u;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public User2 getU() {
		return u;
	}
	public void setU(User2 u) {
		this.u = u;
	}
	public User1() {
		super();
	
	}
	@Override
	public String toString() {
		return "User1 [a=" + a + ", u=" + u + "]";
	}
     
}
