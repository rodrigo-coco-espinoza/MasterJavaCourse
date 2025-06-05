package com.javamastercourse.spring_data_rest_demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceMonitorAspect 
{
    public static final Logger LOGGER = LoggerFactory.getLogger(PerformanceMonitorAspect.class);
    
    @Around("execution(* com.javamastercourse.spring_data_rest_demo..*(..))")
    public Object monitorTime(ProceedingJoinPoint joinPoint) throws Throwable
    {
        long start = System.currentTimeMillis();
        Object object = joinPoint.proceed(); // Proceed with the method execution
        long end = System.currentTimeMillis();

        LOGGER.info("Time taken: " + (end - start) + " ms");

        return object; // Return the result of the method execution
    }
}
