package com.javamastercourse.spring_data_rest_demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution(* com.javamastercourse.spring_data_rest_demo..*(..))")
    public Object validateAndUpdate(ProceedingJoinPoint joinPoint) throws Throwable
    {
        Object[] args = joinPoint.getArgs();
        for (int i = 0; i < args.length; i++) {
            if (args[i] instanceof Integer) {
                int id = (Integer) args[i];
                if (id < 0) {
                    LOGGER.info("positive id required, received: " + id);
                    args[i] = -id;
                    LOGGER.info("id updated to: " + args[i]);
                }
            }
        }
        Object object = joinPoint.proceed(args);
        return object;
    }

}
