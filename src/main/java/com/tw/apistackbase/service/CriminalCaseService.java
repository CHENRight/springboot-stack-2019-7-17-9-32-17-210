package com.tw.apistackbase.service;

import com.tw.apistackbase.entity.CriminalCases;
import com.tw.apistackbase.repository.CriminalCasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CriminalCaseService {

    @Autowired
    private CriminalCasesRepository casesRepository;

    public List<CriminalCases> findAllByName(String caseName) {
        return casesRepository.findAllByName(caseName);
    }

    public CriminalCases findById( int id){
        return casesRepository.findById(id).get();
    }

    public List<CriminalCases> findAll(){
        return casesRepository.findAll();
    }

    List<CriminalCases> findByCaseName(String caseName){
        return  casesRepository.findAllByName(caseName);
    }

    public void delete(int id){
        casesRepository.deleteById(id);
    }
}
