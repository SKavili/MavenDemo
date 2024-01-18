package org.example;


import java.util.Arrays;
import java.util.List;

import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HQLTest {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        //Prep work
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        //HQL example - Get All Employees
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Employee");
        List<Employee> empList = query.list();
        for(Employee emp : empList){
            System.out.println("List of Employees::"+emp.getId()+","+emp.getFirstName());
        }

        //HQL example - Get Employee with id
        query = session.createQuery("from Employee where id= :id");
        query.setParameter("id", 3);
        Employee emp = (Employee) query.uniqueResult();
        System.out.println("Employee::"+emp.getId()+","+emp.getFirstName());

        //HQL pagination example
        query = session.createQuery("from Employee");
        query.setFirstResult(0); //starts with 0
        query.setFetchSize(2);
        empList = query.list();
        for(Employee emp4 : empList){
            System.out.println("Paginated Employees::"+emp4.getId()+","+emp4.getFirstName());
        }

        //HQL Update Employee
        query = session.createQuery("update Employee set firstName= :name where id= :id");
        query.setParameter("name", "Pankaj Kumar");
        query.setParameter("id", 1);
        int result = query.executeUpdate();
        System.out.println("Employee Update Status="+result);



        query = session.createQuery("delete from Employee where id= :id");
        query.setParameter("id", 4);
        result = query.executeUpdate();
        System.out.println("Employee Delete Status="+result);

        //HQL Aggregate function examples
        query = session.createQuery("select sum(salary) from Employee");
        long sumSalary = (Long) query.uniqueResult();
        System.out.println("Sum of all Salaries= "+sumSalary);

        //HQL join examples
//        query = session.createQuery("select e.name, a.city from Employee e "
//                + "INNER JOIN e.address a");
//        List<Object[]> list = query.list();
//        for(Object[] arr : list){
//            System.out.println(Arrays.toString(arr));
//        }

        //HQL group by and like example
        query = session.createQuery("select e.firstName, sum(e.salary), count(e)"
                + " from Employee e where e.firstName like '%i%' group by e.firstName");
        List<Object[]> groupList = query.list();
        for(Object[] arr : groupList){
            System.out.println(Arrays.toString(arr));
        }

        //HQL order by example
        query = session.createQuery("from Employee e order by e.id desc");
        empList = query.list();
        for(Employee emp3 : empList){
            System.out.println("ID Desc Order Employee::"+emp3.getId()+","+emp3.getFirstName());
        }

        //rolling back to save the test data
        tx.rollback();

        //closing hibernate resources
        sessionFactory.close();
    }

}