package org.example;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;
public class BeforeAdvisor implements MethodBeforeAdvice{
    @Override
    public void before(Method method, Object[] args, Object target)throws Throwable {
        System.out.println("""
        ===========================================
        Before Advisor:
    
       Logger can log this information before business logic get executed
       ===========================================
      """

        );
    }
}