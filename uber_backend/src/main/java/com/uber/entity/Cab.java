package com.uber.entity;

import lombok.Data;
import org.postgis.Point;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String cabName;
    String cabNumber;
    String cabType;
    String status;
    Integer capacity;
    Point location;
}
