package org.example;
import org.springframework.beans.factory.BeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

    public class EmpTestHibernateTemplate {
        public static void main(String[] args) {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");


            EmployeeDao dao=(EmployeeDao)ctx.getBean("d");

            Employee e=new Employee();
            e.setId(12);
            e.setFirstName("varun");
            e.setSalary(50000);

            dao.saveEmployee(e);

        }
    }