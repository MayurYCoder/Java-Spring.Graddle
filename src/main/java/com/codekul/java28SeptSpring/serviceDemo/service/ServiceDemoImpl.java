package com.codekul.java28SeptSpring.serviceDemo.service;

import com.codekul.java28SeptSpring.serviceDemo.domain.ServiceDemo;
import com.codekul.java28SeptSpring.serviceDemo.repository.ServiceDemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;


@Service
public class ServiceDemoImpl implements ServiceDemoInterface{

   @Autowired
    private ServiceDemoRepo serviceDemoRepo;

    @Override
    public void saveServiceDemo(ServiceDemo serviceDemo) {
        serviceDemoRepo.save(serviceDemo);
    }
}
