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
@Table(name= "BAHAN_BAKU_BELI")
public class BahanBakuBeli {
	
	@Id
    @Column(name="BBB_CODE" ,length=12, nullable = false)
    private String BbbCode;
	
	@Column (name="BBB_DESC" ,length=100)
    private String BbbDesc;
	
	@Column (name="BBB_SAT" ,length=4)
    private String BbbSat;
	
	@Column (name="BBB_KURS" ,length=2)
    private String BbbKurs;
	
	@Column (name="BBB_HRG" )
	private BigInteger BbbHrg;
	
	@Column (name="BBB_STATUS" ,length=1)
    private String BbbStatus;
	
	@Column (name="BBB_QTY" )
    private Integer BbbQty;
	
	@Column (name="BBB_JUMLAH" )
	private BigInteger BbbJumlah;
	
	@Column (name="BBB_UNIT" )
    private Integer BbbUnit;

}
