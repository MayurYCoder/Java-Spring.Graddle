package com.codekul.java28SeptSpring.manytomany.controller;

import com.codekul.java28SeptSpring.manytomany.Customer;
import com.codekul.java28SeptSpring.manytomany.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("saveCustomer")
    public String saveCustomer(@RequestBody Customer customer){
        customerRepository.save(customer);
        return "customer saved";
    }
}
