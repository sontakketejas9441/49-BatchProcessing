package com.ts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Table(name = "BATCH_SUMMARY")
@Data
@Entity
@ToString
public class BatchSummary {

	@Id
    @GeneratedValue
    @Column(name="SUMMARY_ID")
	private Integer summeryId;
	
	 @Column(name="BATCH_NAME")
	private String batchName;
	
	 @Column(name="FAILURE_TRIGGER_COUNT")
	private Integer failureTriggerCount;
	
	 @Column(name="SUCCESS_TRIGGER_COUNT")
	private Integer successTriggerCount;
	
	 @Column(name="TOTAL_TRIGGER_PROCESSED")
	private Integer totalTriggerProcessed;
}
