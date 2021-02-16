package com.uber.dto;

import lombok.Data;
import org.postgis.Point;

@Data
public class CabDTO {
    String cabName;
    String cabNumber;
    String cabType;
    String status;
    Point location;
    Integer capacity;
}
