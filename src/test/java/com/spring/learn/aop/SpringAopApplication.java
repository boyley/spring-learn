package com.spring.learn.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author bogle
 * @version 1.0 2018/11/12 上午9:35
 */
public class SpringAopApplication {

    @Test
    public void aopTest() {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringAopConfig.class);
        TargetService targetService = applicationContext.getBean(TargetService.class);
        targetService.multiply(1, 3);
    }
}
