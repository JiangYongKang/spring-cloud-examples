package com.vincent.spring.cloud.common.example.module;

import org.springframework.http.ResponseEntity;

/**
 * author: vincent
 * date: 2019-04-22 23:12
 * comment:
 */

public class BaseController {

    public ResponseEntity<?> success() {
        return ResponseEntity.ok(new RestResponse());
    }

    public ResponseEntity<?> success(Object data) {
        return ResponseEntity.ok(new RestResponse(data));
    }

}
