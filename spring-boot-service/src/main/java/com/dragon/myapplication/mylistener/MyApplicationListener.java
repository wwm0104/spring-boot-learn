package com.dragon.myapplication.mylistener;

import com.alibaba.fastjson.JSON;
import com.dragon.myapplication.mylistener.event.MyApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author: weiwanmin
 * @Date: 2020/3/26 23:01
 * @Version 1.0
 */
@Component
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {

    public void onApplicationEvent(MyApplicationEvent myApplicationEvent) {
        System.out.println("自定义的事件:"+ JSON.toJSONString(myApplicationEvent));
    }
}
