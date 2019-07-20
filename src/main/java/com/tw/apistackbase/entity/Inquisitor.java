package com.tw.apistackbase.entity;

import javax.persistence.*;

@Entity
@Table(name = "inquistor")
public class Inquisitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String inquistorName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInquistorName() {
        return inquistorName;
    }

    public void setInquistorName(String inquistorName) {
        this.inquistorName = inquistorName;
    }
}
