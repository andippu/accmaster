package com.master.accmaster.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name= "TAX_SETUP")
public class TaxSetup {
	
	 @Id
	 @Column(name="TAX_ID", length=5, nullable = false)
	 private String taxId;
	 
	 @Column(name="TAX_DESC",length=50, nullable = false)
	 private String taxDesc;
	
	 @Column(name="TAX_IN_VAT")
	 private BigDecimal taxInVat;
	 
	 @Column(name="TAX_IN_VAT_CC")
	 private BigDecimal taxInVatCc;
	 
	 @Column(name="TAX_OUT_VAT")
	 private BigDecimal taxOutVat;
	 
	 @Column(name="TAX_OUT_VAT_CC")
	 private BigDecimal taxOutVatCc;

	 @Column(name="TAX_STATUS",length=1)
	 private String taxStatus;	 
	 
	 @Column(name="TAX_CREATE_USER",length=20)
	 private String taxCreateUser;	
	 
	 @Column(name="TAX_CREATE_DATE",length=20)
	 private Date taxCreateDate;	
	 
	 @Column(name="TAX_UPDATE_USER",length=20)
	 private String taxUpdateUser;	
	 
	 @Column(name="TAX_UPDATE_DATE",length=20)
	 private Date taxUpdateDate;	
	
}
