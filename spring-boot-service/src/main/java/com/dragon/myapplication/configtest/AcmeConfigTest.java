package com.dragon.myapplication.configtest;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: weiwanmin
 * @Date: 2020/4/4 21:04
 * @Version 1.0
 */
@Configuration
public class AcmeConfigTest {

    @ConfigurationProperties(prefix = "acme")
    @Bean
    public AcmeProperties acmeProperties(){
        return new AcmeProperties();
    }
}
