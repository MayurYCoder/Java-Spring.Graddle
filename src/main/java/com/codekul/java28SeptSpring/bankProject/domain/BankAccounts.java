package com.codekul.java28SeptSpring.bankProject.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class BankAccounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String accNo;

    private String ifsc;
    private String branchName;

//    @ManyToOne

//    private ;

}
