package com.master.accmaster.model;

import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "V_BAHAN_BELI")
public class VBahanBeli {
	
	@Id
    @Column(name="V_BBL_CODE" ,length=8, nullable = false)
    private String VBblCode;
	
	@Column (name="V_BBL_DESC" ,length=100)
    private String VBblDesc;

}
