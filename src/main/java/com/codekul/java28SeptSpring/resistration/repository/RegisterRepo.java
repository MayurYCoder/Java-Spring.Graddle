package com.codekul.java28SeptSpring.resistration.repository;

import com.codekul.java28SeptSpring.resistration.domain.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepo extends JpaRepository<Register,Integer> {
}
