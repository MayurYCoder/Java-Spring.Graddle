package com.codekul.java28SeptSpring.manytomany.repository;

import com.codekul.java28SeptSpring.manytomany.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
