package com.uber.controller;

import com.uber.dto.RideDTO;
import com.uber.entity.Cab;
import com.uber.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping("searchRide")
    public List<Cab> searchRide(@RequestParam Long consumerId){
        return bookingService.searchAvailableCabsForConsumer(consumerId);
    }

    @PostMapping("bookRide")
    public ResponseEntity bookRide(@RequestBody RideDTO rideDTO){
        bookingService.bookCab(rideDTO);
        return ResponseEntity.ok().build();
    }
}
