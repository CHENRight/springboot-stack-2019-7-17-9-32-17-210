package com.tw.apistackbase.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "procuratorate")
public class Procuratorate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Column(unique = true, length=50)
    private String procuratorateName;


    @OneToMany(mappedBy = "procuratorate",cascade = CascadeType.ALL)
    private List<CriminalCases> criminalCasess;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProcuratorateName() {
        return procuratorateName;
    }

    public void setProcuratorateName(String procuratorateName) {
        this.procuratorateName = procuratorateName;
    }

    public List<CriminalCases> getCriminalCasess() {
        return criminalCasess;
    }

    public void setCriminalCasess(List<CriminalCases> criminalCasess) {
        this.criminalCasess = criminalCasess;
    }
}
