package com.master.accmaster.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "CUSTOMER")

public class Customer {
    @Id
    @Column(name="CUS_CODE" ,length=6, nullable = false)
    private String cusCode;

    @Column (name="CUS_NAME" ,length=50, nullable = false)
    private String cusName;

    @Column (name="CUS_TYPE" ,length=1)
    private String cusType;

    @Column (name="CUS_ADDR1" ,length=40)
    private String cusAddr1;

    @Column (name="CUS_ADDR2" ,length=100)
    private String cusAddr2;

    @Column (name="CUS_ADDR3" ,length=40)
    private String cusAddr3;

    @Column (name="CUS_KT_CODE" ,length=4)
    private String cusKota;

    @Column (name="CUS_TELP" ,length=25)
    private String cusTelp;

    @Column (name="CUS_FAX" ,length=25)
    private String cusFax;

    @Column (name="CUS_NPWP" ,length=25)
    private String cusNpwp;

    @Column (name="CUS_POT" )
    private Long cusPot;

    @Column (name="CUS_CHGUSER" ,length=40)
    private String cusChgUser;

    @Column (name="CUS_CHGDATE" )
    private Date cusChgDate;

    @Column (name="CUS_JK_WKT" )
    private Integer cusJkWkt;

    @Column (name="CUS_PIUTANG_TYPE", length=1)
    private String cusPiutangType;

    @Column (name="CUS_PJK", length=5 )
    private String cusPjk;

    @Column (name="SALDO_AWAL" )
    private Long cusSaldoAwal;

    @Column (name="CUS_PPN", length=1 )
    private String cusPpn;

    @Column (name="CUS_TOLL", length=1 )
    private String cusToll;

    @Column (name="CUS_POT_BPJS" )
    private Long cusPotBpjs;

    @Column (name="CUS_POT_GN" )
    private Long cusPotGn;

}

