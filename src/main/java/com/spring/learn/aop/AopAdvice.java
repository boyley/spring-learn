package com.spring.learn.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author bogle
 * @version 1.0 2018/11/12 上午9:24
 */
@Aspect
public class AopAdvice {

    Logger log = LoggerFactory.getLogger(AopAdvice.class);

    @Pointcut("execution(public * com.spring.learn.aop.TargetService.*(..))")
    public void pointcut() {

    }

    @Before("pointcut()")
    public void before() {
        log.info("before invoke");
    }

    @After("pointcut()")
    public void after() {
        log.info("after invoke");
    }

    @AfterReturning("pointcut()")
    public void afterReturning() {
        log.info("afterReturning invoke");
    }
}
