package org.example;

import org.springframework.aop.ThrowsAdvice;
public class ThrowsAdvisor implements ThrowsAdvice{
    public void afterThrowing(Exception ex){
        try {
            System.out.println("Handle additional concern if exception occurs");
        }catch (Exception e){

        }
    }
}
