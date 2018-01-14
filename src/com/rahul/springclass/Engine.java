package com.rahul.springclass;

public class Engine {

	public Engine() {
		System.out.println("Engine selected");
	}

	public Engine(String engineName) {
		this.engineName = engineName;
	}

	public String engineName;

	public String getEngineName() {
		return engineName;
	}


	  public void setEngineName(String engineName) { this.engineName =
	 engineName; }
	 

}
