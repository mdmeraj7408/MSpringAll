package com.java.spel.parser;


import org.springframework.stereotype.Component;

@Component
public class Model {
	
private String make;
	
private String model;
private String productOfYear;
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getProductOfYear() {
	return productOfYear;
}
public void setProductOfYear(String productOfYear) {
	this.productOfYear = productOfYear;
}
@Override
public String toString() {
	return "Model [make=" + make + ", model=" + model + ", productOfYear=" + productOfYear + "]";
}

}
