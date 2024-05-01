
package com.wina.jo.max.demo.Entity;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

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
    private Double customerSolde;
    @Column(name = "CUSTOMER_PASSWORD")
    private String customerPassword;
    @Column(name = "CUSTOMER_GENDER")
    private String customerGender;
    @Column(name = "CUSTOMER_ROLE")
    private String customerRole;


    public Customer(Long customerId, String customerName, String customerEmail, Double customerSolde,String customerPassword, String customerGender, String customerRole){
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPassword = customerPassword;
        this.customerSolde = customerSolde;
        this.customerGender = customerGender;
        this.customerRole = customerRole;
    }
    public Customer() {

    }

    public Double getCustomerSolde() {
        return customerSolde;
    }

    public void setCustomerSolde(Double customerSolde) {
        this.customerSolde = customerSolde;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public void setCustomerId(Long id){ this.customerId = customerId; }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public String getCustomerRole() {
        return customerRole;
    }
}
