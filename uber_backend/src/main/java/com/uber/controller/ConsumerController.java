package com.uber.controller;

import com.uber.dto.ConsumerDTO;
import com.uber.dto.DriverDTO;
import com.uber.service.ConsumerService;
import com.uber.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    ConsumerService consumerService;

    @PostMapping("/registerConsumer")
    ResponseEntity registerUser(@RequestBody ConsumerDTO consumerDTO){
        consumerService.registerConsumer(consumerDTO);
        return ResponseEntity.ok().build();
    }
}
