package com.wina.jo.max.demo.repository;

import com.wina.jo.max.demo.Entity.PassedGambleEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PassedGambleEventRepository extends JpaRepository<PassedGambleEvent,Long> {
}
