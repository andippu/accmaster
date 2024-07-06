package com.master.accmaster.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UploadLogErrorsCompKey  implements Serializable{
	
	private Integer uplerrId;	 
	private String uplerrType;
}
