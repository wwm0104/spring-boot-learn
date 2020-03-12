package com.dragon.myapplication.controller;

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
}
