package com.tw.apistackbase.repository;

import com.tw.apistackbase.entity.Inquistor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InquistorRepository extends JpaRepository<Inquistor,Integer> {

}
