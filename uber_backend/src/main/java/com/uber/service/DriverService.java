package com.uber.service;

import com.uber.dto.DriverDTO;
import com.uber.entity.Driver;
import com.uber.repository.DriverRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    @Autowired
    DriverRepository driverRepository;

    public void registerDriver(DriverDTO driverDTO){
        ModelMapper modelMapper = new ModelMapper();
        Driver driver = modelMapper.map(driverDTO, Driver.class);
        driverRepository.save(driver);
    }
}
