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
@Table(name= "SUPPLIER")
public class Supplier {
	
	 @Id
	 @Column(name="SUP_ID" ,length=6, nullable = false)
	 private Integer supId;
	
	 @Column (name="SUP_NAME" ,length=100, nullable = false)
	 private String supName;
	 
	 @Column (name="SUP_ADDR" ,length=200)
	 private String supAddr;
	 
	 @Column (name="SUP_NPWP" ,length=20)
	 private String supNpwp;
	 
	 @Column (name="HUTANG_UMUM")
	 private BigDecimal supHutang;
	 
	 @Column (name="ALIAS" ,length=5)
	 private String supAlias;
	 
	 @Column (name="BLOK" ,length=100)
	 private String supBlok;
	 
	 @Column (name="NOMOR" ,length=20)
	 private String supNomor;
	 
	 @Column (name="RT" ,length=5)
	 private String supRt;
	 
	 @Column (name="RW" ,length=5)
	 private String supRw;
	 
	 @Column (name="KELURAHAN" ,length=60)
	 private String supKelurahan;
	 
	 @Column (name="KECAMATAN" ,length=60)
	 private String supKecamatan;
	 
	 @Column (name="KOTA" ,length=100)
	 private String supKota;
	 
	 @Column (name="PROPINSI" ,length=60)
	 private String supPropinsi;
	 
	 @Column (name="KODE_POS" ,length=8)
	 private String supKodePos;
	 
	 @Column (name="NO_TELP" ,length=20)
	 private String supTelp;
	 
	 @Column (name="NO_FAX" ,length=20)
	 private String supFax;
	 
	 @Column (name="EMAIL" ,length=100)
	 private String supEmail;
	 
	 @Column (name="CONTACT_PERSON" ,length=100)
	 private String supContact;
	 
	 @Column (name="TYPE" ,length=3)
	 private String supType;	
}

