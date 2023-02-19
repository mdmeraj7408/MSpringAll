package com.java.autowired.annotation.qualifire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	@Qualifier("add2")
      private Address add;

	public Address getAdd() {
		return add;
	}
//@Autowired
	public void setAdd(Address add) {
		this.add = add;
	}

	public Emp() {
		super();
		
	}
//@Autowired
	public Emp(Address add) {
	
		super();
		System.out.println("Setting value constructor");
		this.add = add;
	}

	@Override
	public String toString() {
		return "Emp [add=" + add + "]";
	}
	
      
}
