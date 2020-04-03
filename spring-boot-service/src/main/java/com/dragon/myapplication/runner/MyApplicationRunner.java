package com.dragon.myapplication.runner;

import com.alibaba.fastjson.JSON;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @Author: weiwanmin
 * @Date: 2020/4/3 23:48
 * @Version 1.0
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("启动之后,获取参数:"+ JSON.toJSONString(args));
    }
}
