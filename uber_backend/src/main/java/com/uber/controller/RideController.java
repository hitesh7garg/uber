package com.uber.controller;

import com.uber.entity.Location;
import com.uber.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RideController {

    @Autowired
    RideService rideService;

    @PutMapping("/cancelRide")
    ResponseEntity cancelRide(@RequestParam Long id){
        boolean isCancelled = rideService.cancelRide(id);
        if(isCancelled){
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/addDestination")
    ResponseEntity addDestination(@RequestParam Long id, @RequestParam List<Location> locationList){
        boolean isUpdated = rideService.addDestinationToRide(id, locationList);
        if(isUpdated){
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.badRequest().build();
        }
    }

}
