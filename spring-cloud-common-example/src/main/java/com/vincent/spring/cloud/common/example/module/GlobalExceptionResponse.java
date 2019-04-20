package com.vincent.spring.cloud.common.example.module;

import lombok.Data;

/**
 * author: vincent
 * date: 2019-04-20 10:29
 * comment:
 */

@Data
public class GlobalExceptionResponse {
    private Integer code;
    private String message;
}
