package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
public static void main(String[] args) {

	ApplicationContext ac=new ClassPathXmlApplicationContext("FFP.xml");


	Student student=(Student) ac.getBean("studentbean");
	student.setName("Sandeep");
	student.grade.setName("Second grade");


	student.displayInfo();



//	Employee e = (Employee) ac.getBean("emp");
//	e.setName("Ram");
//	e.dept.setName("IT");
//	e.displayInfo();

}
}
