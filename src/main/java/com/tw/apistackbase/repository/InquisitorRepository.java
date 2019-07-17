package com.tw.apistackbase.repository;

import com.tw.apistackbase.entity.Inquisitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InquisitorRepository extends JpaRepository<Inquisitor,Integer> {

}
