package com.javatpoint;

public class Student {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	private Grade g;
	public Grade getG() {
		return g;
	}

	public void setG(Grade g) {
		this.g = g;
		//g.setGrade("Tenth");
	}

	Student(Grade g){
		this.g=g;
	}

public void displayInfo(){
	System.out.println("Hello: "+name+"Grade: "+g.getGrade());
}
}
