package org.example;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args)  {
        try {
//            Resource resource = new ClassPathResource("beans.xml");
//            BeanFactory factory = new XmlBeanFactory(resource);

            ApplicationContext context =
                    new ClassPathXmlApplicationContext("beans.xml");

            Student student = (Student) context.getBean("studentbean");
            //student.setName("Vineeth");
           // student.displayInfo();



            Employee e = (Employee) context.getBean("emp");
            e.setName("Ram");
            e.dept.setName("IT");
            e.displayInfo();
        }catch (Exception e){
             e.printStackTrace();
        }
    }


}
