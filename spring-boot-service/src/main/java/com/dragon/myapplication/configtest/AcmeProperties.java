package com.dragon.myapplication.configtest;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: weiwanmin
 * @Date: 2020/4/4 20:48
 * @Version 1.0
 */
//@ConfigurationProperties(prefix = "acme")
@Data
public class AcmeProperties {
    private boolean enabled;

    private InetAddress remoteAddress;

    private final Security security = new Security();

    @Data
    public static class Security {

        private String username;

        private String password;

        private List<String> roles = new ArrayList<>(Collections.singleton("USER"));


    }
}
