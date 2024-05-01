package com.wina.jo.max.demo.Entity;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "GAMBLE_EVENT")
public class GambleEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GAMBLE_EVENT_ID")
    private Long gambleId;
    @Column(name = "GAMBLE_EVENT_CUSTOMER_ID")
    private Long userId;
    @Column(name = "GAMBLE_EVENT_OLYMPIC",length=1000)
    private String olympicEvent;
    @Column(name = "GAMBLE_EVENT_AMOUNT")
    private Double amount;
    @Column(name = "GAMBLE_EVENT_BET")
    private String pay;

    public GambleEvent(Long gambleId, Long userId, String olympicEventId, Double amount,String pay){
        this.gambleId = gambleId;
        this.userId = userId;
        this.olympicEvent = olympicEventId;
        this.amount = amount;
        this.pay = pay;
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

    public String getPay() {
        return pay;
    }
}
