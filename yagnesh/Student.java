package java_spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
Student(Id id){
	this.id=id;
}


Id id;
public void setId(Id id){
	this.id=id;
}
public Id getId(){
	return id;
}
	public void displayInfo(){
		System.out.println("Hello: "+name);
		System.out.println("Id: "+id.getId());
	}


}


