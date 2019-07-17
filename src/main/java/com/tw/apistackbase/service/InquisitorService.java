package com.tw.apistackbase.service;

import com.tw.apistackbase.entity.Inquisitor;
import com.tw.apistackbase.repository.InquisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InquisitorService {

    @Autowired
    private InquisitorRepository inquisitorRepository;

    public Inquisitor findById(int id){
        return inquisitorRepository.findById(id).get();
    }
}
