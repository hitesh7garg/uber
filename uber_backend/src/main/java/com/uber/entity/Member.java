package com.uber.entity;

import lombok.Data;
import org.postgis.Point;

import javax.persistence.*;

@Entity
@Data
public abstract class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String firstName;
    String lastName;
    String email;
    Integer phoneNumber;
    Long walletId;
    Integer rating;
    Point location;
    String city;
    String username;
}
