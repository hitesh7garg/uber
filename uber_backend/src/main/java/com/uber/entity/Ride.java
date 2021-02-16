package com.uber.entity;

import lombok.Data;
import org.postgis.Point;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @OneToMany(mappedBy = "ride")
    List<Location> sourceAndDestination;
    Point currentLocation;
    Long consumerId;
    Long driverId;
    Long fare;
    String status;
    String transactionStatus;
}
