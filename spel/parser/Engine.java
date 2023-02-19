package com.java.spel.parser;

public class Engine {
   private int capacity;
   private int horsePower;
   private int numberOfCylender;
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
public int getHorsePower() {
	return horsePower;
}
public void setHorsePower(int horsePower) {
	this.horsePower = horsePower;
}
public int getNumberOfCylender() {
	return numberOfCylender;
}
public void setNumberOfCylender(int numberOfCylender) {
	this.numberOfCylender = numberOfCylender;
}
@Override
public String toString() {
	return "Engin [capacity=" + capacity + ", horsePower=" + horsePower + ", numberOfCylender=" + numberOfCylender
			+ "]";
}
   
}
