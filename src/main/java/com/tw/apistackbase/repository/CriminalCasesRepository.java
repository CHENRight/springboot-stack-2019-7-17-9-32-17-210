package com.tw.apistackbase.repository;

import com.tw.apistackbase.entity.CriminalCases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CriminalCasesRepository extends JpaRepository<CriminalCases,Integer> {

}
