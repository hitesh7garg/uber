package com.uber.controller;

import com.uber.dto.CabDTO;
import com.uber.service.CabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CabController {

    @Autowired
    CabService cabService;

    @PostMapping("registerCab")
    public ResponseEntity registerCab(@RequestBody CabDTO cabDTO){
        cabService.registerCab(cabDTO);
        return ResponseEntity.ok().build();
    }
}
