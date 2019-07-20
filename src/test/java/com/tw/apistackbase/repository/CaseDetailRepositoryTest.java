package com.tw.apistackbase.repository;

import com.tw.apistackbase.entity.CaseDetail;
import org.hibernate.validator.constraints.br.TituloEleitoral;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ExtendWith(SpringExtension.class)
class CaseDetailRepositoryTest {

    @Autowired
    private CaseDetailRepository caseDetailRepository;

    @Test
    void should_save_and_find_case_detail() {
        CaseDetail caseDetail = new CaseDetail();
        caseDetail.setObjectiveElements("objective");
        caseDetail.setSubjectiveElements("subjective");
        caseDetailRepository.save(caseDetail);

        CaseDetail resultCaseDetail = caseDetailRepository.findById(caseDetail.getId()).get();

        assertThat(resultCaseDetail.getObjectiveElements()).isEqualTo("objective");
        assertThat(resultCaseDetail.getSubjectiveElements()).isEqualTo("subjective");
    }

    @Test
    void should_delete_case_detail() {
        CaseDetail caseDetail = new CaseDetail();
        caseDetail.setObjectiveElements("objective");
        caseDetail.setSubjectiveElements("subjective");

        caseDetailRepository.save(caseDetail);
        caseDetailRepository.delete(caseDetail);

        assertThat(caseDetailRepository.findAll().size()).isEqualTo(0);
    }

}