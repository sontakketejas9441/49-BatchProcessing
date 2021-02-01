package com.ts.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Table(name = "CO_PDFS")
@Data
@Entity
@ToString
public class CoTriggers {

	@Id
    @GeneratedValue
    @Column(name="TRG_ID")
	private Integer trgId;
	
	@Column(name="CASE_NO")
	private Integer caseNo;
	
	@Column(name="CREATE_DT")
	private Date createDt;
	
	@Column(name="TRG_STATUS")
	private String trgStatus;
	
	@Column(name="UPDATE_DT")
	private Date updateDate;
	
}
