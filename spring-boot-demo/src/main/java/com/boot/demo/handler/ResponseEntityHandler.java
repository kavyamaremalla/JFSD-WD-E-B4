package com.boot.demo.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ResponseEntityHandler {

    public static ResponseEntity<Object> generateResponse(String message, HttpStatus status, Object responseObj){

        Map<String, Object> map = new HashMap<>();
        map.put("message", message);
        map.put("status", status);
        map.put("data", responseObj);
        map.put("Executed Time", new Date());

        return  new ResponseEntity<>(map, status);
    }
}
