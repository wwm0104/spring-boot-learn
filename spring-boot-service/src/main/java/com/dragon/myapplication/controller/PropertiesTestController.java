package com.dragon.myapplication.controller;

import com.alibaba.fastjson.JSON;
import com.dragon.myapplication.configtest.AcmeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author: weiwanmin
 * @Date: 2020/4/4 21:16
 * @Version 1.0
 */
@RestController
@RequestMapping("/properties-get")
public class PropertiesTestController {
    @Autowired
    private AcmeProperties acmeProperties;

    @GetMapping("/address")
    public String getRemoteAddress(HttpServletResponse response){
        return JSON.toJSONString(acmeProperties.getRemoteAddress());
    }

    @GetMapping("/enable")
    public String getEnabled(){
        return JSON.toJSONString(acmeProperties.isEnabled());
    }

    @GetMapping("/security")
    public String getPropertyValue(){
        return JSON.toJSONString(acmeProperties.getSecurity());
    }
}
