package com.codekul.java28SeptSpring.onetomany.repository;

import com.codekul.java28SeptSpring.onetomany.domain.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike,Integer> {
}
