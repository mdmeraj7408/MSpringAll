package com.java.autowire;

public class Emp {
      private Address add;

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Emp() {
		super();
		
	}

	public Emp(Address add) {
		super();
		this.add = add;
	}

	@Override
	public String toString() {
		return "Emp [add=" + add + "]";
	}
	
      
}
