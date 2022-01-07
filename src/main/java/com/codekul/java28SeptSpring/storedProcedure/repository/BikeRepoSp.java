package com.codekul.java28SeptSpring.storedProcedure.repository;

import com.codekul.java28SeptSpring.onetomany.domain.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface BikeRepoSp extends JpaRepository<Bike,Integer> {

    @Query(value = "{call getBikeData()}",nativeQuery = true)
    List<Map<String,String>>getBikeData();
}
