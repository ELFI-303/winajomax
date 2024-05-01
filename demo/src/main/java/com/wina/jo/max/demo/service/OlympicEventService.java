package com.wina.jo.max.demo.service;
import java.util.List;

import com.wina.jo.max.demo.Entity.OlympicEvent;
import com.wina.jo.max.demo.repository.OlympicEventRepository;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import org.springframework.beans.factory.annotation.Autowired;

@Path("olympic")
public class OlympicEventService {
    @Autowired
    private OlympicEventRepository olympicEventRepository;
    @GET
    @Produces(value = "application/json")
    public List<OlympicEvent> getOlympicEvents() {
        List<OlympicEvent> olympics = olympicEventRepository.findAll();
        if(!olympics.isEmpty()){
            return olympics;
        }
        return null;
    }
}