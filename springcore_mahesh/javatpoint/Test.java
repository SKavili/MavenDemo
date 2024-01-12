package com.javatpoint;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
public static void main(String[] args) {

	ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	Student student=(Student)ac.getBean("studentbean");
	student.displayInfo();
}
}
