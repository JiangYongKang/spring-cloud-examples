package com.vincent.spring.cloud.common.example.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * author: vincent
 * date: 2019-04-20 09:58
 * comment:
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class GlobalException extends RuntimeException {

    private Integer code;

    public GlobalException() {
    }

    public GlobalException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public GlobalException(String message) {
        super(message);
    }

    public GlobalException(String message, Throwable cause) {
        super(message, cause);
    }

    public GlobalException(Throwable cause) {
        super(cause);
    }

    public GlobalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
