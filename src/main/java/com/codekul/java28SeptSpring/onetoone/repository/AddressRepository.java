package com.codekul.java28SeptSpring.onetoone.repository;

import com.codekul.java28SeptSpring.JPA.Employee;
import com.codekul.java28SeptSpring.onetoone.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {

}
