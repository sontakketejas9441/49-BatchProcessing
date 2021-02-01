package com.ts.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ts.entity.BatchDetails;

public interface BatchDetailsRepository extends JpaRepository<BatchDetails, Serializable>{

}
