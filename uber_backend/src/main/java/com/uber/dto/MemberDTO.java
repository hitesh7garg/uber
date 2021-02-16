package com.uber.dto;

import lombok.Data;
import org.postgis.Point;

@Data
public abstract class MemberDTO {
    String firstName;
    String lastName;
    String city;
    String email;
    Integer phoneNumber;
    Long walletId;
    Integer rating;
    Point location;
}
