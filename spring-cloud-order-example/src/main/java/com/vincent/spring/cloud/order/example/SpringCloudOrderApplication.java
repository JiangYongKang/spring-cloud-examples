package com.vincent.spring.cloud.order.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * author: vincent
 * date: 2019-04-13 14:45
 * comment:
 */

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOrderApplication.class, args);
    }
}
