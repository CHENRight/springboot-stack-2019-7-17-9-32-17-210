package com.tw.apistackbase.entity;

import javax.persistence.*;

@Entity
@Table(name = "criminal_cases")
public class CriminalCases {

    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private long caseHappenTime;

    @OneToOne
    private CaseDetail caseDetail;



    public CriminalCases() {
    }

    public CriminalCases(String name, long caseHappenTime) {
        this.name = name;
        this.caseHappenTime = caseHappenTime;
    }

    public long getCaseHappenTime() {
        return caseHappenTime;
    }

    public String getName() {
        return name;
    }
}
