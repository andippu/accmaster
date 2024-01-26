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
@Table(name= "JENIS_BARANG")
public class JenisBarang {

    @Id
    @Column(name="JB_CODE" ,length=20, nullable = false)
    private String jbCode;

    @Column (name="JB_DESC" ,length=60, nullable = false)
    private String jbDesc;

    @Column (name="JB_CHGUSER" ,length=40)
    private String jbChgUser;

    @Column (name="JB_CHGDATE" )
    private Date jbChgDate;

}
