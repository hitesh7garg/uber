package com.uber.repository;

import com.uber.entity.Cab;
import com.uber.entity.Consumer;
import org.postgis.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.*;
import java.util.List;

public interface CabRepository extends JpaRepository<Cab, Long> {

    @Query(value = "Select * FROM cab c where c.status = status limit 1", nativeQuery = true)
    Cab findFirstByLocationNearAndStatus(Point userPoint, String status);

}
