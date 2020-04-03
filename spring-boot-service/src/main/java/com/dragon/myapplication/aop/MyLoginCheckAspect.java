package com.dragon.myapplication.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.annotation.Target;

/**
 * @Author: weiwanmin
 * @Date: 2020/3/29 0:01
 * @Version 1.0
 */
@Aspect
@Component
public class MyLoginCheckAspect {
    /**
     * com.dragon.myapplication.controller 这个包下的类中含有LoginCheck注解的都会被拦截
     * @param joinPoint
     */
    @Before("execution(* com.dragon.myapplication.controller.*.*(..)) && @annotation(com.dragon.myapplication.aop.myannotations.LoginCheckTest)")
   public void  checkLogin(JoinPoint joinPoint){
        System.out.println("切点的方法名:"+joinPoint.getSignature().getName());
        System.out.println("切点所在的类名称"+joinPoint.getSignature().getDeclaringTypeName());
    }

    @Before("target(com.dragon.service.order.IOrderInter)")
    public void  testTarget(JoinPoint joinPoint){
        System.out.println("target:"+joinPoint.getSignature().getName());
        System.out.println("target:"+joinPoint.getSignature().getDeclaringTypeName());
    }

    @Before("@within(com.dragon.myapplication.aop.myannotations.LoginCheckTest)")
    public void  testTargetzhujie (JoinPoint joinPoint){
        System.out.println("testTargetzhujie:"+joinPoint.getSignature().getName());
        System.out.println("testTargetzhujie:"+joinPoint.getSignature().getDeclaringTypeName());
    }

}
