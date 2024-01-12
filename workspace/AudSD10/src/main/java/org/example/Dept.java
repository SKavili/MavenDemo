package org.example;
public class Dept {
    Dept(){
        System.out.println("Dept bean created");
    }
    private java.lang.String name = "IT";

    public java.lang.String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Hello: "+name);
    }
}