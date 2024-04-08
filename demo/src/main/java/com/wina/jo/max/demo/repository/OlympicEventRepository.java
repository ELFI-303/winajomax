package com.wina.jo.max.demo.repository;

import com.wina.jo.max.demo.Entity.OlympicEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface OlympicEventRepository extends JpaRepository<OlympicEvent,Long> {
}
