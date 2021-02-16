package com.uber.dto;

import com.uber.entity.Location;
import lombok.Data;
import org.postgis.Point;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Data
public class RideDTO {
    Location source;
    List<Location> destination;
    Point currentLocation;
    Long consumerId;
    Long driverId;
    Long fare;
    String status;
    String transactionStatus;
}
