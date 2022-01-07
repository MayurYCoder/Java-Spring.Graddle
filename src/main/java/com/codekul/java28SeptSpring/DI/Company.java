package com.codekul.java28SeptSpring.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
    private int id;
    private String name;
    private String Address;
/*
    //field based
    @Autowired
    private Employee employee;

//setter based
    @Autowired
    public Employee employee;
    public void setEmployee(){
        this.employee=employee;
    }

 */

    private Employee employee;

    @Autowired
    public Company(Employee employee){
        this.employee=employee;
    }
    public void getData(){
        employee.show();
    }
}
