package com.vincent.spring.cloud.one.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * author: vincent
 * date: 2019-04-13 14:45
 * comment:
 */

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudServiceOneApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServiceOneApplication.class, args);
    }
}
