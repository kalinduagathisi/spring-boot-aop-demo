package com.kalicoder.springaopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DemoLoggingAspect {

    // here we add our all advices for logging

    // @Before advice

    @Before("execution(public void addAccount())")
    public void beforeAddAccountAdvice(){
        System.out.println("======> executing @Before advice on addAccount()");
    }
}
