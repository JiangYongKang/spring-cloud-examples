package com.vincent.spring.cloud.order.example.service;

import com.vincent.spring.cloud.common.example.module.RestResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * author: vincent
 * date: 2019-04-22 23:20
 * comment:
 */

@FeignClient("spring-cloud-inventory-example")
public interface InventoryFeignService {

    @PutMapping("/inventory/lock/{id}")
    RestResponse lock(@PathVariable("id") Integer id);

    @PutMapping("/inventory/unlock/{id}")
    RestResponse unlock(@PathVariable("id") Integer id);

}
