package com.codekul.java28SeptSpring.resistration.controller;

import com.codekul.java28SeptSpring.resistration.domain.Register;
import com.codekul.java28SeptSpring.resistration.repository.RegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="*")
public class RegisterController {

    @Autowired
    private RegisterRepo registerRepo;

    @PostMapping("saveRegister")
    public String saveRegister(@RequestBody Register register){
        registerRepo.save(register);
        return "Registration Successful";
    }
}
