package com.uber.service;

import com.uber.dto.RideDTO;
import com.uber.entity.*;
import com.uber.repository.CabRepository;
import com.uber.repository.ConsumerRepository;
import com.uber.repository.DriverRepository;
import com.uber.repository.RideRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    CabRepository cabRepository;

    @Autowired
    ConsumerRepository consumerRepository;

    @Autowired
    DriverRepository driverRepository;

    @Autowired
    RideRepository rideRepository;

    public List<Cab> searchAvailableCabsForConsumer(Long consumerId){
        Optional<Consumer> consumerOptional = consumerRepository.findById(consumerId);
        if(consumerOptional.isPresent()) {
            Cab microCab = cabRepository.findFirstByLocationNearAndStatus(consumerOptional.get().getLocation(), "AVAILABLE");
            return Collections.singletonList(microCab);
        }else{
            return Collections.emptyList();
        }
    }

    public void bookCab(RideDTO rideDTO){
        ModelMapper modelMapper = new ModelMapper();
        Ride ride = modelMapper.map(rideDTO, Ride.class);
        rideRepository.save(ride);
    }
}
