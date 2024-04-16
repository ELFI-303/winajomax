package com.wina.jo.max.demo;

import com.wina.jo.max.demo.service.CustomerService;
import com.wina.jo.max.demo.service.GambleEventService;
import com.wina.jo.max.demo.service.OlympicEventService;
import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("demo")
@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        register(CustomerService.class);
        register(GambleEventService.class);
        register(OlympicEventService.class);
    }
}