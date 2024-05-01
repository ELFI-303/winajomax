package com.wina.jo.max.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wina.jo.max.demo.Entity.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
        @Query(value = "SELECT CUSTOMER_SOLDE FROM CUSTOMER WHERE CUSTOMER_ID = :customerId", nativeQuery = true)
        Double getCustomerSolde(@Param("customerId") Long customerId);
        @Query(value = "SELECT * FROM CUSTOMER WHERE CUSTOMER_NAME = :customerName", nativeQuery = true)
        Customer findByUsername(@Param("customerName") String customerName);
}
