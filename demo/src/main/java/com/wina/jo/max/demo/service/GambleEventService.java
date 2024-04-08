package com.wina.jo.max.demo.service;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Optional;
import com.wina.jo.max.demo.Entity.GambleEvent;
import com.wina.jo.max.demo.repository.GambleEventRepository;
import jakarta.ws.rs.QueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GambleEventService {
    @Autowired
    private GambleEventRepository gambleEventRepository;
    public GambleEvent saveGambleEvent(GambleEvent gambleEvent) {
        return gambleEventRepository.save(gambleEvent);
    }
    public Optional<GambleEvent> getGambleEventById(Long gambleEventId) { return gambleEventRepository.findById(gambleEventId); }
    public List<GambleEvent> getCustomerGambleEvents(@QueryParam("customerId") Long customerId){
        if(customerId != null){
            return gambleEventRepository.getCustomerGambles(customerId);
        }
        return null;
    }
}