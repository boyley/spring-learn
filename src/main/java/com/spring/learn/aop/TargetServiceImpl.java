package com.spring.learn.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author bogle
 * @version 1.0 2018/11/12 上午9:25
 */
public class TargetServiceImpl implements TargetService {

    Logger log = LoggerFactory.getLogger(AopAdvice.class);

    @Override public int multiply(int a, int b) {
        log.info("方法调用");
        return a * b;
    }
}
