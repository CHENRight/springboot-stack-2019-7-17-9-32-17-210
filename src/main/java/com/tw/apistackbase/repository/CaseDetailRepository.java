package com.tw.apistackbase.repository;

import com.tw.apistackbase.entity.CaseDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseDetailRepository extends JpaRepository<CaseDetail, Integer> {

}
