package com.dragon.myapplication.aop;

import org.springframework.boot.autoconfigure.condition.ConditionOutcome;
import org.springframework.boot.autoconfigure.condition.SpringBootCondition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author: weiwanmin
 * @Date: 2020/4/7 23:23
 * @Version 1.0
 */
public class MyConditional extends SpringBootCondition {
    @Override
    public ConditionOutcome getMatchOutcome(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String value = context.getEnvironment().getProperty("test.auto.login.aop");
        boolean equals = "YES".equals(value);
        return equals ?new ConditionOutcome(true,"加载自动注入的aop"):new ConditionOutcome(false,"不加载自动注入的aop");
    }
}
