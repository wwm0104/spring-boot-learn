package com.dragon.myapplication;

import com.dragon.myapplication.mylistener.ApplicationListenerTest;
import com.dragon.myapplication.mylistener.MyApplicationListener;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: weiwanmin
 * @Date: 2020/3/12 23:06
 * @Version 1.0
 */
@SpringBootApplication(scanBasePackages = "com.dragon.*")
@EnableAspectJAutoProxy
public class Application {
    public static void main(String[] args) {


        /*//定制启动
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.setBannerMode(Banner.Mode.CONSOLE);
        springApplication.addListeners(new MyApplicationListener(),new ApplicationListenerTest());
        springApplication.run(args);*/

        SpringApplication.run(Application.class,args);
    }
}
