package com.tw.apistackbase.service;

import com.tw.apistackbase.entity.Inquistor;
import com.tw.apistackbase.repository.InquistorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InquistorService {

    @Autowired
    private InquistorRepository inquistorRepository;

    public Inquistor findById(int id){
        return inquistorRepository.findById(id).get();
    }
}
