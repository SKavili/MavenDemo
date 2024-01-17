package org.example;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;


public class AfterAdvisor implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
     System.out.println("""
       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    After Advisor:
   
    
       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
      """);

            System.out.println("additional concern after actual logic");
            System.out.println("method info:"+method.getName()+" "+method.getModifiers());
            System.out.println("argument info:");
            for(Object arg:args)
                System.out.println(arg);
            System.out.println("target Object:"+target);
            System.out.println("target object class name: "+target.getClass().getName());
        }
}
