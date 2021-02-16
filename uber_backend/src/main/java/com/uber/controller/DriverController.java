package com.uber.controller;

import com.uber.dto.DriverDTO;
import com.uber.entity.Cab;
import com.uber.entity.Driver;
import com.uber.service.DriverService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
public class DriverController {

    @Autowired
    DriverService driverService;

    @PostMapping("/registerDriver")
    ResponseEntity registerUser(@RequestBody DriverDTO driverDTO){
        driverService.registerDriver(driverDTO);
        return ResponseEntity.ok().build();
    }
}
