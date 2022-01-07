package com.codekul.java28SeptSpring.storedProcedure.controller;



import com.codekul.java28SeptSpring.storedProcedure.repository.BikeRepoSp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class BikeControllerSp  {
    @Autowired
    private BikeRepoSp bikeRepoSp;

    @GetMapping("getBikedata")
    public List<Map<String, String>> getBikeData() {
       return bikeRepoSp.getBikeData();
    }


}
