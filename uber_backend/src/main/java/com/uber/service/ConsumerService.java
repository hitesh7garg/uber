package com.uber.service;

import com.uber.dto.ConsumerDTO;
import com.uber.dto.DriverDTO;
import com.uber.entity.Consumer;
import com.uber.entity.Driver;
import com.uber.repository.ConsumerRepository;
import com.uber.repository.DriverRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @Autowired
    ConsumerRepository consumerRepository;

    public void registerConsumer(ConsumerDTO consumerDTO){
        ModelMapper modelMapper = new ModelMapper();
        Consumer consumer = modelMapper.map(consumerDTO, Consumer.class);
        consumerRepository.save(consumer);
    }
}
