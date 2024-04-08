package com.wina.jo.max.demo.controller;

import com.wina.jo.max.demo.Entity.OlympicEvent;
import com.wina.jo.max.demo.service.OlympicEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class OlympicEventController {
    @Autowired
    private OlympicEventService olympicEventService;
    @GetMapping(value = "/olympicEvent/{olympicEventId}")
    public ResponseEntity<Optional<OlympicEvent>> findOlympicEventById(@PathVariable Long olympicEventId) {
        return new ResponseEntity<>(olympicEventService.getOlympicEventById(olympicEventId), HttpStatus.OK);
    }
    @GetMapping(value = "/olympicEvent")
    public ResponseEntity<List<OlympicEvent>> findAllOlympicEvents() {
        return new ResponseEntity<>(olympicEventService.getOlympicEvents(), HttpStatus.OK);
    }
}
