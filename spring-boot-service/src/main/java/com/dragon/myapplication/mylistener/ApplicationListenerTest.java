package com.dragon.myapplication.mylistener;

import com.alibaba.fastjson.JSON;
import com.dragon.myapplication.mylistener.event.MyApplicationEvent;
import com.dragon.myapplication.pojo.Order;
import org.springframework.boot.context.event.*;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Author: weiwanmin
 * @Date: 2020/3/27 23:11
 * @Version 1.0
 */
public class ApplicationListenerTest implements ApplicationListener<ApplicationEvent> {
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if(applicationEvent instanceof ApplicationStartingEvent){
            System.out.println("事件超类:ApplicationStartingEvent:"+ JSON.toJSONString(applicationEvent));
        }
        if(applicationEvent instanceof ApplicationEnvironmentPreparedEvent){
            System.out.println("事件超类:ApplicationEnvironmentPreparedEvent:"+ JSON.toJSONString(applicationEvent));
        }

        if(applicationEvent instanceof ApplicationContextInitializedEvent){
            ApplicationContextInitializedEvent event = (ApplicationContextInitializedEvent)applicationEvent;
            System.out.println("事件超类:ApplicationContextInitializedEvent"+event.getApplicationContext());
         }

        if(applicationEvent instanceof ApplicationPreparedEvent){
            ApplicationPreparedEvent event = (ApplicationPreparedEvent)applicationEvent;
            System.out.println("事件超类:ApplicationPreparedEvent"+event.getApplicationContext());
        }

        if(applicationEvent instanceof ApplicationStartedEvent){
            ApplicationStartedEvent event = (ApplicationStartedEvent)applicationEvent;
            event.getApplicationContext().publishEvent(new MyApplicationEvent(event.getSource(),new Order()));
            System.out.println("事件超类:ApplicationStartedEvent"+event.getApplicationContext());
        }

        if(applicationEvent instanceof ApplicationReadyEvent){
            ApplicationReadyEvent event = (ApplicationReadyEvent)applicationEvent;
            System.out.println("事件超类:ApplicationReadyEvent"+event.getApplicationContext());
        }


        if(applicationEvent instanceof ApplicationFailedEvent){
            ApplicationFailedEvent event = (ApplicationFailedEvent)applicationEvent;
            System.out.println("事件超类:ApplicationFailedEvent"+event.getApplicationContext());
        }



    }
}
