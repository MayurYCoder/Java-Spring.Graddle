package com.codekul.java28SeptSpring.resistration.domain;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Setter
@Getter
public class Register {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @NotNull(message="Email cannot be null")
    private String email;
    private String password;
    private String name;
    private String lastName;

}
