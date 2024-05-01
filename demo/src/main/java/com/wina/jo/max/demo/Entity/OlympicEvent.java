package com.wina.jo.max.demo.Entity;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

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

    public OlympicEvent(Integer eventId, String discipline, String dateTime, String lieu, String participants, String result, String cote) {
        this.eventId = eventId;
        this.discipline = discipline;
        this.dateTime = dateTime;
        this.lieu = lieu;
        this.participants = participants;
        this.result = result;
        this.cote = cote;
    }
    public OlympicEvent() {

    }

    public Integer getEventId() {
        return eventId;
    }

    public String getDiscipline() {
        return discipline;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getLieu() {
        return lieu;
    }

    public String getParticipants() {
        return participants;
    }

    public String getResult() {
        return result;
    }

    public String getCote() {
        return cote;
    }
}