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

    public HelloModel(
            String text
    ) {
        this.text = text;
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
}
