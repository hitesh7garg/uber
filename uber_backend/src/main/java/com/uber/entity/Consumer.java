package com.uber.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Consumer extends Member{
    Long numberOfRidesTaken;
}
