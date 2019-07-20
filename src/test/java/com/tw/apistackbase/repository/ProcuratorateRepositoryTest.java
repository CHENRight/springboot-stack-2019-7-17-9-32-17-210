package com.tw.apistackbase.repository;

import com.tw.apistackbase.entity.CriminalCases;
import com.tw.apistackbase.entity.Procuratorate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@DataJpaTest
@ExtendWith(SpringExtension.class)
class ProcuratorateRepositoryTest {

    @Autowired
    private ProcuratorateRepository procuratorateRepository;

    @Test
    void should_return(){
        Procuratorate procuratorate = new Procuratorate();
        procuratorate.setId(1);
        procuratorate.setProcuratorateName("ZHA");

        procuratorateRepository.save(procuratorate);
        Procuratorate fetchP = procuratorateRepository.findById(procuratorate.getId()).get();

        assertThat(fetchP.getProcuratorateName()).isEqualTo("ZHA");
    }


    @Test
    public void should_save_criminal_cases_and_return_with_all_seved_case(){
        Procuratorate procuratorate = new Procuratorate();
        procuratorate.setProcuratorateName("ZHA");
        CriminalCases case1 = new CriminalCases("case1",20190718);
        CriminalCases case2 = new CriminalCases("case2",20220223);
        procuratorate.setCriminalCasess(Arrays.asList(case1,case2));

        procuratorateRepository.save(procuratorate);
        Procuratorate fetchP = procuratorateRepository.findAll().get(0);
        assertNotNull(fetchP.getCriminalCasess().get(0));

    }


}