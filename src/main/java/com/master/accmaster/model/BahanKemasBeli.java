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
@Table(name= "BAHAN_KEMAS_BELI")
public class BahanKemasBeli {
	
	@Id
    @Column(name="BBK_CODE" ,length=12, nullable = false)
    private String BbkCode;
	
	@Column (name="BBK_DESC" ,length=100)
    private String BbkDesc;
	
	@Column (name="BBK_SAT" ,length=4)
    private String BbkSat;
	
	@Column (name="BBK_KURS" ,length=2)
    private String BbkKurs;
	
	@Column (name="BBK_HRG" )
	private BigInteger BbkHrg;
	
	@Column (name="BBK_STATUS" ,length=1)
    private String BbkStatus;
	
	@Column (name="BBK_QTY" )
    private Integer BbkQty;
	
	@Column (name="BBK_JUMLAH" )
	private BigInteger BbkJumlah;
	
	@Column (name="BBK_UNIT" )
    private Integer BbkUnit;

}
