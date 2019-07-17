package com.tw.apistackbase.entity;

import javax.persistence.*;

@Entity
@Table(name = "procuratorate")
public class Procuratorate {

    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String procuratorateName;

    @OneToMany
    @JoinColumn(name = "criminalCases_id")
    private CriminalCases criminalCases;

}
