package com.vincent.spring.cloud.inventory.example.controller;

import com.vincent.spring.cloud.common.example.module.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: vincent
 * DateTime: 2019/4/18 22:30
 * Comment:
 */

@Slf4j
@RestController
@RequestMapping("/inventory")
public class InventoryController extends BaseController {

    @PutMapping("/lock/{id}")
    public ResponseEntity<?> lock(@PathVariable Integer id) {
        log.info("lock -> {}", id);
        return success();
    }

    @PutMapping("/unlock/{id}")
    public ResponseEntity<?> unlock(@PathVariable Integer id) {
        log.info("unlock -> {}", id);
        return success();
    }

}
