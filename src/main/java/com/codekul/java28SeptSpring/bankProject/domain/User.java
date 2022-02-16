package com.codekul.java28SeptSpring.bankProject.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private String name;
    private  String firstName;
    private String lastName;
    private String address;
    private String email;
    private String contact;


    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<BankAccounts> bankAccountsList;

}
