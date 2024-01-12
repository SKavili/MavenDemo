package com.javapoint;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
public static void main(String[] args) {

//	BeanFactory factory=new XmlBeanFactory(resource);
	ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Student student=(Student)ac.getBean("studentbean");
	student.displayInfo();

}
}
