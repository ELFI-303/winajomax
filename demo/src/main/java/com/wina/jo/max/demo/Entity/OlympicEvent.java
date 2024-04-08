package com.wina.jo.max.demo.Entity;

import jakarta.persistence.*;
@Entity
@Table(name = "OLYMPIC_EVENT")
public class OlympicEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OLYMPIC_EVENT_ID")
    private Integer eventId;
    @Column(name = "OLYMPIC_EVENT_DISCIPLINE")
    private String discipline;
    @Column(name = "OLYMPIC_EVENT_DATE_TIME")
    private String dateTime;
    @Column(name = "OLYMPIC_EVENT_LIEU")
    private String lieu;
    @Column(name = "OLYMPIC_EVENT_PARTICIPANTS")
    private String participants;
    @Column(name = "OLYMPIC_EVENT_RESULT")
    private String result;
    @Column(name = "OLYMPIC_EVENT_PAYS_COTE")
    private String cote;
}