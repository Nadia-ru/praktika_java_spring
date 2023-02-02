package com.github.practikaspring.model;


import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "hello_data")
public class HelloModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public long getId() {
        return id;
    }
}
