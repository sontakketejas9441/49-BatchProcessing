package com.ts.entity;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Table(name = "BATCH_RUN_DTLS")
@Data
@Entity
@ToString
public class BatchDetails {

	@Id
    @GeneratedValue
    @Column(name="BATCH_RUN_SEQ")
	private Integer batchRunSequence;
	
	@Column(name="BATCH_NAME")
	private String batchName;
	
	@Column(name="BATCH_RUN_STATUS")
	private String batchRunStatus;
	
	@Column(name="END_DATE")
	private Date endDate;
	
	@Column(name="INSTANCE_NUM")
	private Integer instanceNumber;
	
	@Column(name="START_DATE")
	private Date startDate;
	
}
