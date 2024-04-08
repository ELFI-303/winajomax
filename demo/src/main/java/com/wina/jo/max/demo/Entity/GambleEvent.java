package com.wina.jo.max.demo.Entity;
import jakarta.persistence.*;
@Entity
@Table(name = "GAMBLE_EVENT")
public class GambleEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GAMBLE_EVENT_ID")
    private Long gambleId;
    @Column(name = "GAMBLE_EVENT_USER_ID")
    private Long userId;
    @Column(name = "GAMBLE_EVENT_OLYMPIC_ID")
    private Integer olympicEventId;
    @Column(name = "GAMBLE_EVENT_AMOUNT")
    private Double amount;

    public GambleEvent(Long gambleId, Long userId, Integer olympicEventId, Double amount){
        this.gambleId = gambleId;
        this.userId = userId;
        this.olympicEventId = olympicEventId;
        this.amount = amount;
    }
}
