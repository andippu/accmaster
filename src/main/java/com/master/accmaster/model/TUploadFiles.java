package com.master.accmaster.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "T_UPLOAD_FILES")
public class TUploadFiles {
	@Id
	@Column(name="TUFLTYPE" ,length=3, nullable = false)
    private String tuflType;
	
	@Column(name="TUFLNAME" ,length=80)
    private String tuflName;
	
	@Column(name="TUFLFILES")
	@Lob
    private byte[] tuflFiles;
	
	
}
