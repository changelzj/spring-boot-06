package com.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CalcAspect {

    @After("execution(* com.example.service.*.*(..))")
    public void after() {
        System.out.println("After 后置");
    }

    @Before("execution(* com.example.service.*.*(..))")
    public void before() {
        System.out.println("Before 前置");
    }

    @AfterReturning("execution(* com.example.service.*.*(..))")
    public void returning() {
        System.out.println("AfterReturning 返回后");
    }

    @AfterThrowing("execution(* com.example.service.*.*(..))")
    public void throwing() {
        System.out.println("AfterThrowing 异常后");
    }

    @Around("execution(* com.example.service.*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知前");
        Object obj = joinPoint.proceed();
        System.out.println("环绕通知后");
        return obj;
    }
}
