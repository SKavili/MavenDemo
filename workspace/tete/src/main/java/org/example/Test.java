package org.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {


    public static void main(String[] args)  {
        try {
//            Resource resource = new ClassPathResource("beans.xml");
//            BeanFactory factory = new XmlBeanFactory(resource);

            ApplicationContext context =
                    new ClassPathXmlApplicationContext("beans.xml");

            Student student = (Student) context.getBean("studentbean");
            student.setName("Vineeth");
            student.displayInfo();
        }catch (Exception e){
e.printStackTrace();
        } catch (BeansException e) {
            throw new RuntimeException(e);
        }
    }


}
