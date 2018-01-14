package com.rahul.springclass;

public class Car {
	
	public Engine engine;

	public Car() {
		System.out.println("Car intialized");
	}
	
	public Car(Engine engine) {
		this.engine = engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void print() {
		System.out.println("Car with " + engine.getEngineName()+" : Engine installed");
	}
	
}
