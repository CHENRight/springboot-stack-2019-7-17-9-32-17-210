package com.tw.apistackbase.repository;

import com.tw.apistackbase.entity.CriminalCases;
import org.hibernate.Criteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CriminalCasesRepository extends JpaRepository<CriminalCases,Integer> {

    List<CriminalCases> findAllByName(String name);
    List<CriminalCases> findAllByOrderByCaseHappenTimeDesc();



}
