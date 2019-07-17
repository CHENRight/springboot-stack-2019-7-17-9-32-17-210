package com.tw.apistackbase.entity;

import javax.persistence.*;

@Entity
@Table(name = "inquistor")
public class Inquistor {

    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String inquistorName;
}
