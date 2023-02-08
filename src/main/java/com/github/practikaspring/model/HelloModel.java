package com.github.practikaspring.model;


import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "hello_data")
public class HelloModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "time")
    private Timestamp time;
    @Column(name = "text")
    private String text;
    @Column(name = "ip_client")
    private String ip;
    public HelloModel(
            String text, String ip
    ) {
        this.text = text;
        this.ip =ip;
        this.time = new Timestamp(System.currentTimeMillis());
    }

    public HelloModel() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
