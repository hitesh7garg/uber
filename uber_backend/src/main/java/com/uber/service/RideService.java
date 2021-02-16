package com.uber.service;

import com.uber.entity.Location;
import com.uber.entity.Ride;
import com.uber.repository.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RideService {
    @Autowired
    RideRepository rideRepository;

    public boolean cancelRide(Long id){
        Optional<Ride> ride = rideRepository.findById(id);
        if(ride.isPresent()){
            Ride rideObject = ride.get();
            rideObject.setStatus("CANCELLED");
            return true;
        }
        return false;
    }

    public boolean addDestinationToRide(Long id, List<Location> locationList){
        Optional<Ride> ride = rideRepository.findById(id);
        if(ride.isPresent()){
            Ride rideObject = ride.get();
            rideObject.setSourceAndDestination(locationList);
            return true;
        }
        return false;
    }
}
