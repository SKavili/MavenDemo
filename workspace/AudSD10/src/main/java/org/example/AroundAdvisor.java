package org.example;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class AroundAdvisor implements MethodInterceptor {


    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {


            System.out.println("""
       999999999999999999999999999999999999999999
       AroundAdvisor:
       999999999999999999999999999999999999999999

      """);

        Object obj;
        System.out.println("####################Beofere Around Advice");

        obj=invocation.proceed();

        System.out.println("#####################After Around Advice");

        return obj;

    }
}