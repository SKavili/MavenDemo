package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {

		ApplicationContext ac=new ClassPathXmlApplicationContext("FFP_V.xml");


		Student student=(Student) ac.getBean("studentbean");
		student.setName("Vineeth Sajjan");
		student.grade.setName("Fourth grade");


		student.displayInfo();



//  Employee e = (Employee) ac.getBean("emp");
//  e.setName("Ram");
//  e.dept.setName("IT");
//  e.displayInfo();

	}
}