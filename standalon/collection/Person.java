package com.java.standalon.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
      private List<String> freinds;
      private Map<String,Integer> feeStructure;
      private Properties properties;
	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}

	public List<String> getFreinds() {
		return freinds;
	}

	public void setFreinds(List<String> freinds) {
		this.freinds = freinds;
	}
	

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Person [freinds=" + freinds + ", feeStructure=" + feeStructure + ", properties=" + properties + "]";
	}

	

	
      
}
