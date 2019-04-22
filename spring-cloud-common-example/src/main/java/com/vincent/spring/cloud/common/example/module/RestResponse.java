package com.vincent.spring.cloud.common.example.module;

import lombok.Data;

/**
 * author: vincent
 * date: 2019-04-22 23:14
 * comment:
 */

@Data
public class RestResponse {

    private Integer code;

    private String message;

    private Object data;

    public RestResponse() {
        this(200, "success");
    }

    public RestResponse(Object data) {
        this();
        this.data = data;
    }

    public RestResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
