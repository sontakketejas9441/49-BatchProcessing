package com.ts.entity;

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
public class CoPdf {
	
	@Id
    @GeneratedValue
    @Column(name="CO_PDF_ID")
	private Integer coPdfIdInteger;

	@Column(name="PLAN_STATUS")
	private String planStatus;
	
	@Column(name="CASE_NUMBER")
	private String caseNumber;
	
	@Column(name="PDF_DOCUMENT")
	private Long pdfDocument;
	
	@Column(name="PLAN_NAME")
	private String planName;
}
