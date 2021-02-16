package com.uber.service;

import com.uber.dto.CabDTO;
import com.uber.entity.Cab;
import com.uber.repository.CabRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CabService {
    @Autowired
    CabRepository cabRepository;

    public void registerCab(CabDTO cabDTO){
        ModelMapper modelMapper = new ModelMapper();
        Cab cab = modelMapper.map(cabDTO, Cab.class);
        cabRepository.save(cab);
    }
}
