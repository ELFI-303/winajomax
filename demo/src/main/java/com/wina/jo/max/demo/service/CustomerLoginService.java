package com.wina.jo.max.demo.service;
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Component;
import java.util.List;
import org.springframework.security.core.userdetails.UserDetails;
@Component
public class CustomerLoginService {
    @Autowired
    private CustomerService customerService;
    @Bean
    public InMemoryUserDetailsManager initiateUsers(){
        List<Object[]> customers = customerService.getCustomerLoginEvent();
        for ( Object[] customer: customers ) {
            String username = customer[0].toString();
            String password = customer[1].toString();
            String role = customer[2].toString();
            if (customer != null){
                UserDetails userDetails = User.withDefaultPasswordEncoder()
                        .username(username)
                        .password(password)
                        .roles(role)
                        .build();
                return new InMemoryUserDetailsManager(userDetails);

            }
        }
        UserDetails userDetails = User.withDefaultPasswordEncoder()
                .username("user")
                .password("password")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(userDetails);
    }
}*/
