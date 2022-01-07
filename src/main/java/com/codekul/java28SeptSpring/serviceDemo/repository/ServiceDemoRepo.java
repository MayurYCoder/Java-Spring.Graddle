package com.codekul.java28SeptSpring.serviceDemo.repository;

import com.codekul.java28SeptSpring.serviceDemo.domain.ServiceDemo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceDemoRepo extends JpaRepository<ServiceDemo,Integer> {
}
