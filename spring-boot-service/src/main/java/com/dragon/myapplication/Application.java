package com.dragon.myapplication;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: weiwanmin
 * @Date: 2020/3/12 23:06
 * @Version 1.0
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        /*
        //定制启动
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.setBannerMode(Banner.Mode.CONSOLE);
        springApplication.run(args);*/
        SpringApplication.run(Application.class,args);
    }
}
