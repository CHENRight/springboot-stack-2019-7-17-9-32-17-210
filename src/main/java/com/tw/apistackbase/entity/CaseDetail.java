package com.tw.apistackbase.entity;


import javax.persistence.*;

@Entity
@Table(name="case_detail")
public class CaseDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String objectiveElements;
    @Column(nullable = false)
    private String subjectiveElements;

    public CaseDetail() {
    }

    public CaseDetail(String objectiveElements, String subjectiveElements) {
        this.objectiveElements = objectiveElements;
        this.subjectiveElements = subjectiveElements;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObjectiveElements() {
        return objectiveElements;
    }

    public void setObjectiveElements(String objectiveElements) {
        this.objectiveElements = objectiveElements;
    }

    public String getSubjectiveElements() {
        return subjectiveElements;
    }

    public void setSubjectiveElements(String subjectiveElements) {
        this.subjectiveElements = subjectiveElements;
    }
}
