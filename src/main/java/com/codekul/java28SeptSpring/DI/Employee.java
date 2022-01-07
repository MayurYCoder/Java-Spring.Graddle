package com.codekul.java28SeptSpring.DI;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Employee {
    private int id;
    private String name;
    private String Address;

    public void show(){
        System.out.println("In a employee class's method");
    }
    public Employee(){
        System.out.println("object created");
    }
}
