package com.uber.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
public class Coordinate {
    Double latitude;
    Double longitude;
}
