package com.vincent.spring.cloud.eureka.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * author: vincent
 * date: 2019-04-13 14:28
 * comment:
 */

@EnableZuulProxy
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaApplication.class, args);
    }
}
