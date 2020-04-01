package com.dragon.myapplication.aop.myannotations;

import java.lang.annotation.*;

/**
 * @Author: weiwanmin
 * @Date: 2020/3/28 23:55
 * @Version 1.0
 */
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface LoginCheck {
    String  checkFlag() default "test";
    String  mame();
}
