package com.vincent.spring.cloud.one.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: vincent
 * DateTime: 2019/4/18 22:30
 * Comment:
 */

@RestController
@RequestMapping("/services")
public class ServiceController {

    @GetMapping
    public ResponseEntity<?> info() {
        return ResponseEntity.ok(System.currentTimeMillis());
    }

}
