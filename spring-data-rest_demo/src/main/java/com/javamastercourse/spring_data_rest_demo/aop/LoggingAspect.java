package com.javamastercourse.spring_data_rest_demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
    
    // Return type class_name.method_name(parameters)
    @Before("execution(* com.javamastercourse.spring_data_rest_demo..*(..))")
    // This pointcut expression matches all methods in all classes
    public void logMethodCall(JoinPoint joinPoint)
    {
        LOGGER.info("Method called: " + joinPoint.getSignature().getName());
    }

    @After("execution(* com.javamastercourse.spring_data_rest_demo..*(..))")
    public void logMethodExecuted(JoinPoint joinPoint)
    {
        LOGGER.info("Method executed: " + joinPoint.getSignature().getName());
    }

    @AfterThrowing(pointcut = "execution(* com.javamastercourse.spring_data_rest_demo..*(..))", throwing = "exception")
    public void logMethodException(JoinPoint joinPoint, Throwable exception)
    {
        LOGGER.error("Exception in method: " + joinPoint.getSignature().getName() + " with message: " + exception.getMessage());
    }
}
