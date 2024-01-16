package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Plan p = new Plan(1,"Payment Collection");
        System.out.println(p.planid());
        System.out.println(p.plan());


    }
}


record Plan(int planid, String plan){



}