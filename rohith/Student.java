package com.javapoint;
public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	Grade g;

	public Grade getG() {
		return g;
	}

	public void setG(Grade g) {
		this.g = g;

	}
	public void displayInfo() {
		System.out.println("Hello: " + name);
		System.out.println("Grade is "+g.getStd());
	}

}