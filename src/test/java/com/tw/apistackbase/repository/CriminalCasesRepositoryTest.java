package com.tw.apistackbase.repository;

import com.tw.apistackbase.entity.CaseDetail;
import com.tw.apistackbase.entity.CriminalCases;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
@ExtendWith(SpringExtension.class)

class CriminalCasesRepositoryTest {

    @Autowired
    private CriminalCasesRepository criminalCasesRepository;
    private CaseDetailRepository caseDetailRepository;

    @Test
    void should_return_Case_list_when_given_a_case_name(){

        CriminalCases criminalCases1 = new CriminalCases("case",19981223);
        CriminalCases criminalCases2  = new CriminalCases("case",20190718);
        CriminalCases criminalCases3 = new CriminalCases("case3",22222222);

        criminalCasesRepository.save(criminalCases1);
        criminalCasesRepository.save(criminalCases2);
        criminalCasesRepository.save(criminalCases3);

        List<CriminalCases> result = criminalCasesRepository.findAllByName("case");
        assertThat(result.size()).isEqualTo(2);
    }

    @Test
    void should_return_Case_list_order_by_happen_time_desc(){

        CriminalCases criminalCases1 = new CriminalCases("case1",19981223);
        CriminalCases criminalCases2  = new CriminalCases("case2",20190718);
        CriminalCases criminalCases3 = new CriminalCases("case3",22222222);

        criminalCasesRepository.save(criminalCases1);
        criminalCasesRepository.save(criminalCases2);
        criminalCasesRepository.save(criminalCases3);

        List<CriminalCases> result = criminalCasesRepository.findAllByOrderByCaseHappenTimeDesc();
        assertThat(result.get(0).getName()).isEqualTo("case3");

    }

    @Test
    public void should_one_to_one_normally(){
        CriminalCases criminalCases = new CriminalCases("case",20190718);

        CaseDetail caseDetail = new CaseDetail("objective","subjective");

        criminalCases.setCaseDetail(caseDetail);

        criminalCasesRepository.save(criminalCases);

        CriminalCases fetchCriminalCase = criminalCasesRepository.findById(criminalCases.getId()).get();

        assertNotNull(fetchCriminalCase.getCaseDetail());

    }



}