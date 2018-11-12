package com.spring.learn.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author bogle
 * @version 1.0 2018/11/12 上午9:23
 */
@Configuration
@EnableAspectJAutoProxy
public class SpringAopConfig {

    @Bean
    public AopAdvice aopAdvice() {
        return new AopAdvice();
    }

    @Bean
    public TargetService targetService() {
        return new TargetServiceImpl();
    }
}
