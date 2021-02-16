package com.uber.entity;

import lombok.Data;
import org.postgis.Point;

import javax.persistence.*;

@Entity
@Data
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String address;
    Point coordinates;
    @ManyToOne
    Ride ride;
}
