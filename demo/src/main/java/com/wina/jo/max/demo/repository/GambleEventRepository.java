package com.wina.jo.max.demo.repository;

import com.wina.jo.max.demo.Entity.GambleEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface GambleEventRepository extends JpaRepository<GambleEvent,Long> {
    @Query(value = "SELECT * FROM GAMBLE_EVENT WHERE USER_ID = :customerId", nativeQuery = true)
    List<GambleEvent> getCustomerGambles(@Param("customerId") Long customerId);
}
