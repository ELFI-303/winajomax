package com.wina.jo.max.demo.service;

import com.wina.jo.max.demo.Entity.Customer;
import com.wina.jo.max.demo.repository.CustomerRepository;
import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.*;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

import static java.lang.Long.parseLong;


@Controller
@Path("customer")
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    
    public Long getUserId(){
        if (SecurityContextHolder.getContext().getAuthentication() != null){
            return parseLong(SecurityContextHolder.getContext().getAuthentication().getCredentials().toString());
        }
        return null;
    }
    @GET
    @Produces(value = "application/json")
    public String getCustomerById() {
        Optional<Customer> customer = customerRepository.findById(getUserId());
        if(!customer.isEmpty()){
            JSONObject jsonCustomer = new JSONObject();
            Customer loadedCustomer = customer.get();
            jsonCustomer.put("customerName",loadedCustomer.getCustomerName());
            jsonCustomer.put("customerEmail",loadedCustomer.getCustomerEmail());
            jsonCustomer.put("customerSolde",loadedCustomer.getCustomerSolde());
            jsonCustomer.put("customerGender",loadedCustomer.getCustomerGender());
            return jsonCustomer.toString();
        }
        return null;
    }
    public void updateCustomerSolde( Double solde) {
        Optional<Customer> customer = customerRepository.findById(getUserId());
        if(!customer.isEmpty()){
            Customer updatedCustomer = customer.get();
            updatedCustomer.setCustomerSolde(updatedCustomer.getCustomerSolde()+solde);
            customerRepository.save(updatedCustomer);
        }
    }

}
