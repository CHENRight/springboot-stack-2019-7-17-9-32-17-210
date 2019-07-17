package com.tw.apistackbase.entity;


import javax.persistence.*;

@Entity
@Table(name="case_detail")
public class CaseDetail {

    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String objectiveElements;
    @Column(nullable = false)
    private String subjectiveElements;

    @OneToOne
    @JoinColumn(name = "criminal_case_id")
    private CriminalCases criminalCases;

}
