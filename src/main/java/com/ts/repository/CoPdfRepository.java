package com.ts.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ts.entity.CoPdf;

public interface CoPdfRepository extends JpaRepository<CoPdf, Serializable>{

}
