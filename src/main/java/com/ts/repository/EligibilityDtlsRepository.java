package com.ts.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ts.entity.EligibilityDtls;

public interface EligibilityDtlsRepository extends JpaRepository<EligibilityDtls, Serializable>{

}
