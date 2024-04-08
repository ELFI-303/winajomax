package com.wina.jo.max.demo.controller;

import com.wina.jo.max.demo.Entity.GambleEvent;
import com.wina.jo.max.demo.service.GambleEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class GambleEventController {
    @Autowired
    private GambleEventService gambleEventService;
    @GetMapping(value = "/gambleEvent/{gambleEventId}")
    public ResponseEntity<Optional<GambleEvent>> findGambleEventById(@PathVariable Long gambleEventId) {
        return new ResponseEntity<>(gambleEventService.getGambleEventById(gambleEventId), HttpStatus.OK);
    }
    @PostMapping(value = "/gambleEvent", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<GambleEvent> saveGamble(@RequestBody GambleEvent gambleEvent) {
        return new ResponseEntity<>(gambleEventService.saveGambleEvent(gambleEvent), HttpStatus.OK);
    }
    @GetMapping(value = "/gambleCustomerEvent/{customerId}")
    public ResponseEntity<List<GambleEvent>> findGambleEventCustomerById(@PathVariable Long customerId) {
        return new ResponseEntity<>(gambleEventService.getCustomerGambleEvents(customerId), HttpStatus.OK);
    }
}