package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    Employee(){
        System.out.println("Employee bean created");
    }
    private String name;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Dept getDept() {
        return dept;
    }

    Employee(Dept d){
        this.dept=d;

    }
    Dept dept;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Hello: "+name+" from "+dept.getName());
    }
}