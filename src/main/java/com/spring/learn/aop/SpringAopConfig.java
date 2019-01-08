package com.spring.learn.aop;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * org.springframework.aop.config.internalAutoProxyCreator=AnnotationAwareAspectJAutoProxyCreator
 *
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

    @Bean
    public BeanPostProcessor beanPostProcessor() {
        return new BeanPostProcessor(){

            @Override public Object postProcessBeforeInitialization(Object bean, String beanName)
                throws BeansException {
                return bean;
            }

            @Override public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
                return bean;
            }
        };
    }
}
