package com.codekul.java28SeptSpring.onetoone.controller;

import com.codekul.java28SeptSpring.onetoone.model.Address;
import com.codekul.java28SeptSpring.onetoone.model.User;
import com.codekul.java28SeptSpring.onetoone.repository.AddressRepository;
import com.codekul.java28SeptSpring.onetoone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    @PostMapping("saveUser")
    public String saveUser(){
        User user=new User();
        user.setName("Mayur");
        user.setEmail("123@12");

        Address address=new Address();
        address.setAddress("Pune");
        address.setPincode(411052);

        user.setAddress(address);
        address.setUser(user);

        userRepository.save(user);
        addressRepository.save(address);

        return"user saved";
    }

}
