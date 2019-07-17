package com.tw.apistackbase.service;

import com.tw.apistackbase.entity.Procuratorate;
import com.tw.apistackbase.repository.ProcuratorateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProcuratorateService {


    @Autowired
    private ProcuratorateRepository procuratorateRepository;

    public Procuratorate findById(int id){
        return procuratorateRepository.findById(id).get();
    }
}
