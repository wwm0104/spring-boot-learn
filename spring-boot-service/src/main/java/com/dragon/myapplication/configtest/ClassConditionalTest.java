package com.dragon.myapplication.configtest;

import com.dragon.myapplication.pojo.OrderTest;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: weiwanmin
 * @Date: 2020/4/11 22:05
 * @Version 1.0
 */
@Configuration
public class ClassConditionalTest {
    /*@Bean
    @ConditionalOnClass(name = "com.google.gson.Gson")
    public OrderTest orderTest(){
        OrderTest orderTest = new OrderTest();
        System.out.println("因为引入了gson,所以初始化");
        return orderTest;
    }

    @Bean
    @ConditionalOnMissingClass(value = "com.google.gson.Gson")
    public OrderTest orderTest2(){
        OrderTest orderTest = new OrderTest();
        System.out.println("因为没有引入了gson,所以初始化");
        return orderTest;
    }*/

    @Bean
    @ConditionalOnBean(type = {"com.google.gson.Gson"})
    public OrderTest orderTest3(){
        OrderTest orderTest = new OrderTest();
        System.out.println("因为有引入了gson,所以初始化");
        return orderTest;
    }

    @Bean
    @ConditionalOnExpression("#{'YES'.equals(environment['test.auto.login.aop'])}")
    public OrderTest orderTest4(){
        OrderTest orderTest = new OrderTest();
        System.out.println("当属性值等于YES时才会注入");
        return orderTest;
    }
}
