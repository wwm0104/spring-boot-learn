package com.dragon.myapplication.controller;

import com.dragon.myapplication.aop.myannotations.LoginCheck;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: weiwanmin
 * @Date: 2020/3/12 23:12
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "spring-boot-test")
public class RestControllerTest {
    @GetMapping(value = "/")
    public String method(){
        return "Helle Spring boot";
    }

    @GetMapping(value = "/method2")
    @LoginCheck(checkFlag ="你好",mame = "method2")
    public String method2(){
        return "Helle Spring boot2";
    }
}
