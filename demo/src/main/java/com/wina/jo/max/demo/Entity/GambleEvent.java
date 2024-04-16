package com.wina.jo.max.demo.Entity;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "GAMBLE_EVENT")
@XmlRootElement
public class GambleEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GAMBLE_EVENT_ID")
    private Long gambleId;
    @Column(name = "GAMBLE_EVENT_CUSTOMER_ID")
    private Long userId;
    @Column(name = "GAMBLE_EVENT_OLYMPIC_ID")
    private String olympicEvent;
    @Column(name = "GAMBLE_EVENT_AMOUNT")
    private Double amount;

    public GambleEvent(Long gambleId, Long userId, String olympicEvent, Double amount){
        this.gambleId = gambleId;
        this.userId = userId;
        this.olympicEvent = olympicEvent;
        this.amount = amount;
    }
    public GambleEvent() {

    }

    public Long getGambleId() {
        return gambleId;
    }

    public Long getUserId() {
        return userId;
    }

    public String getOlympicEvent() {
        return olympicEvent;
    }

    public Double getAmount() {
        return amount;
    }
}
