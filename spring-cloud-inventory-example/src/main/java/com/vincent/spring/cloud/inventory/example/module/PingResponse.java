package com.vincent.spring.cloud.inventory.example.module;

import lombok.Data;

import java.sql.Timestamp;

/**
 * author: vincent
 * date: 2019-04-20 17:31
 * comment:
 */

@Data
public class PingResponse {

    private Integer serverPort;

    private String applicationName;

    private Timestamp currentTime;

    public PingResponse() {
        this.currentTime = new Timestamp(System.currentTimeMillis());
    }
}
