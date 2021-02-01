package com.ts.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ts.entity.BatchSummary;

public interface BatchSummaryRepository extends JpaRepository<BatchSummary, Serializable>{

}
