package com.vincent.spring.cloud.two.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * author: vincent
 * date: 2019-04-13 14:46
 * comment:
 */

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudServiceTwoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServiceTwoApplication.class, args);
    }
}
