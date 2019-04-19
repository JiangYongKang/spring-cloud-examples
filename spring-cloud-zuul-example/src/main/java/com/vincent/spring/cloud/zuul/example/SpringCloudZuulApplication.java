package com.vincent.spring.cloud.zuul.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * author: vincent
 * date: 2019-04-13 14:28
 * comment:
 */

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuulApplication.class, args);
    }
}
