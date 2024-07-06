package com.master.accmaster.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "UPLOAD_LOG_ERROR")
@IdClass(UploadLogErrorsCompKey.class)
public class UploadLogErrors {
	 @Id
	 @Column(name="UPLOG_ID", length=5, nullable = false)
	 private Integer uplerrId;
	 
	 @Id
	 @Column(name="UPLOAD_TYPE", length=3, nullable = false)
	 private String uplerrType;
	 
	 @Column(name="UPLOG_DATE", length=20, nullable = false)
	 private String uplerrDate;
	 
	 @Column(name="UPLOG_ERROR", length=60)
	 private String uplerrError;
	 
	 
	   

}
