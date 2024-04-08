
//package com.wina.jo.max.demo.Entity;

import jakarta.persistence.*;
@Entity
@Table(name = "CUSTOMER")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID")
    private Long customerId;
    @Column(name = "CUSTOMER_NAME")
    private String customerName;
    @Column(name = "CUSTOMER_EMAIL")
    private String customerEmail;
    @Column(name = "CUSTOMER_SOLDE")
    private Long customerSolde;
    @Column(name = "CUSTOMER_PASSWORD")
    private String customerPassword;
    @Enumerated(EnumType.STRING)
    @Column(name = "CUSTOMER_GENDER")
    private CustomerGender customerGender;
    @Enumerated(EnumType.STRING)
    @Column(name = "CUSTOMER_ROLE")
    private CustomerRole customerRole;

    public enum CustomerGender {
        MALE,FEMALE
    }
    public enum CustomerRole {
        ADMIN,USER
    }
}
