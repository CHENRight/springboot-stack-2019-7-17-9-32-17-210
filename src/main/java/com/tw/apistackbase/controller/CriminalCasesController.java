package com.tw.apistackbase.controller;

import com.tw.apistackbase.entity.CriminalCases;
import com.tw.apistackbase.service.CriminalCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.reverse;


@RestController
@RequestMapping("/criminalCases")
public class CriminalCasesController {

    @Autowired
    private CriminalCaseService criminalCaseService;

    @GetMapping("/{id}")
    public CriminalCases findById(@PathVariable int id){
        return criminalCaseService.findById(id);
    }

    @GetMapping
    public List<CriminalCases> findAll(){
        List<CriminalCases> criminalCases =  criminalCaseService.findAll();
        List<CriminalCases> criminalCases1 =  criminalCases.stream().sorted(Comparator.comparing(CriminalCases::getCaseHappenTime)).collect(Collectors.toList());
        reverse(criminalCases1);
        return criminalCases1;
    }

    @GetMapping("/{caseName}")
    public List<CriminalCases> findByCaseName(@PathVariable String caseName){
        return criminalCaseService.findAllByName(caseName);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        criminalCaseService.delete(id);
    }
}
