package com.ts.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Table(name = "ELGBLTY_DTLS")
@Data
@Entity
@ToString
public class EligibilityDtls {
	
	@Id
    @GeneratedValue
    @Column(name="ED_TRACE_ID") 
	private Integer edTraceId;
	
	@Column(name="BENEFIT_AMT") 
	private String bnftAmt;
	
	@Column(name="CASE_NO") 
	private Integer caseNo;
	
	@Column(name="CREATE_DT") 
	private Date createDate;
	
	@Column(name="DENIAL_REASON") 
	private String denialReason;
	
	@Column(name="START_DT")
	private Date planStartDate;
	
	@Column(name="END_DT")
	private Date planEndDate;
	
	@Column(name="UPDATE_DT")
	private Date planUpdateDate;
	
	@Column(name="PLAN_NAME")
	private String planName;
	
	@Column(name="PLAN_STATUS")
	private String planStatus;
	
}
