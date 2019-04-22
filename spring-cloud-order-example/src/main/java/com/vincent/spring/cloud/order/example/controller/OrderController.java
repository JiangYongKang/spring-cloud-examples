package com.vincent.spring.cloud.order.example.controller;

import com.vincent.spring.cloud.common.example.module.BaseController;
import com.vincent.spring.cloud.order.example.service.InventoryFeignService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Author: vincent
 * DateTime: 2019/4/18 22:30
 * Comment:
 */

@RestController
@RequestMapping("/order")
public class OrderController extends BaseController {

    @Resource
    private InventoryFeignService inventoryFeignService;

    @PostMapping
    public ResponseEntity<?> create() {
        inventoryFeignService.lock(1);
        return ResponseEntity.ok(System.currentTimeMillis());
    }

}
