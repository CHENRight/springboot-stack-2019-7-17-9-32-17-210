package com.tw.apistackbase.entity;

import org.springframework.context.annotation.Lazy;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@Table(name = "criminal_cases")
public class CriminalCases {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private long caseHappenTime;

    @OneToOne
    private CaseDetail caseDetail;

    @ManyToOne(fetch = LAZY)
    private Procuratorate procuratorate;


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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCaseHappenTime(long caseHappenTime) {
        this.caseHappenTime = caseHappenTime;
    }

    public CaseDetail getCaseDetail() {
        return caseDetail;
    }

    public void setCaseDetail(CaseDetail caseDetail) {
        this.caseDetail = caseDetail;
    }
}
