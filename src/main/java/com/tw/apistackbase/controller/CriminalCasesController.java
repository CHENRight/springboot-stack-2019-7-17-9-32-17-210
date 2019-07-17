package com.tw.apistackbase.controller;

import com.tw.apistackbase.entity.CriminalCases;
import com.tw.apistackbase.repository.CriminalCasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class CriminalCasesController {

    @Autowired
    private CriminalCasesRepository criminalCasesRepository;

    @GetMapping("/criminalCases/{id}")
    public CriminalCases findById(@PathVariable int id){
        return criminalCasesRepository.findById(id).get();
    }
}
