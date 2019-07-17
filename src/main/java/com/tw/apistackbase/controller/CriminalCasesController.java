package com.tw.apistackbase.controller;

import com.tw.apistackbase.entity.CriminalCases;
import com.tw.apistackbase.repository.CriminalCasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.reverse;


@RestController
@RequestMapping("/criminalCases")
public class CriminalCasesController {

    @Autowired
    private CriminalCasesRepository criminalCasesRepository;

    @GetMapping("/{id}")
    public CriminalCases findById(@PathVariable int id){
        return criminalCasesRepository.findById(id).get();
    }

    @GetMapping
    public List<CriminalCases> findAll(){
        List<CriminalCases> criminalCases =  criminalCasesRepository.findAll();
        List<CriminalCases> criminalCases1 =  criminalCases.stream().sorted(Comparator.comparing(CriminalCases::getCaseHappenTime)).collect(Collectors.toList());
        reverse(criminalCases1);
        return criminalCases1;
    }
}
