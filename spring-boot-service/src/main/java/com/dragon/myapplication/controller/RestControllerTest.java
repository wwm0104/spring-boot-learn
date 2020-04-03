package com.dragon.myapplication.controller;

import com.dragon.myapplication.aop.myannotations.LoginCheckTest;
import com.dragon.service.order.IOrderInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: weiwanmin
 * @Date: 2020/3/12 23:12
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "test")

public class RestControllerTest {
    @Autowired
    private IOrderInter orderInter;

    @GetMapping(value = "/")
    public String method(){
        return orderInter.createHYOrder();
    }

    @GetMapping(value = "/method2")
    @LoginCheckTest(checkFlag = "dest",mame = "ce")
    public String method2(){
        return orderInter.createPPOrder();
    }
}
