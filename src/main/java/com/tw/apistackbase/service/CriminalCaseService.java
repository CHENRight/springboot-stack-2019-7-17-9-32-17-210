package com.tw.apistackbase.service;

import com.tw.apistackbase.entity.CriminalCases;

import java.util.List;

public interface CriminalCaseService {
    List<CriminalCases> findAllByName(String caseName);
}
