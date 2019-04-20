package com.vincent.spring.cloud.common.example.exception;

import com.vincent.spring.cloud.common.example.module.GlobalExceptionResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author: vincent
 * date: 2019-04-20 09:56
 * comment:
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = GlobalException.class)
    public ResponseEntity<?> renderGlobalException(GlobalException exception) {
        exception.printStackTrace();
        GlobalExceptionResponse response = new GlobalExceptionResponse();
        response.setCode(exception.getCode());
        response.setMessage(exception.getMessage());
        return ResponseEntity.ok(response);
    }

}
