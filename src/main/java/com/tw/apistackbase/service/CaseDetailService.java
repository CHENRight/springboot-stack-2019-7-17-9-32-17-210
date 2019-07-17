package com.tw.apistackbase.service;

import com.tw.apistackbase.entity.CaseDetail;
import com.tw.apistackbase.repository.CaseDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaseDetailService {

    @Autowired
    private CaseDetailRepository caseDetailRepository;

    public CaseDetail findById(int id){
        return caseDetailRepository.findById(id).get();
    }
}
