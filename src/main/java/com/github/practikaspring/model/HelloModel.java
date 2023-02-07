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

    public HelloModel() {
        this.time = new Timestamp(System.currentTimeMillis());
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
}
