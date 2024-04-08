package com.wina.jo.max.demo.service;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Optional;
import com.wina.jo.max.demo.Entity.OlympicEvent;
import com.wina.jo.max.demo.repository.OlympicEventRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OlympicEventService {
    @Autowired
    private OlympicEventRepository olympicEventRepository;
    public Optional<OlympicEvent> getOlympicEventById(Long olympicEventId) { return olympicEventRepository.findById(olympicEventId); }
    public List<OlympicEvent> getOlympicEvents() { return olympicEventRepository.findAll(); }
}