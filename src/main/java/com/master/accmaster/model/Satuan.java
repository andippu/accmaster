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
@Table(name= "SATUAN")
public class Satuan {

    @Id
    @Column(name="SAT_CODE" ,length=10, nullable = false)
    private String satCode;

    @Column(name="SAT_DESC" ,length=10, nullable = false)
    private String satDesc;

    @Column(name="SAT_CHGUSER" ,length=40)
    private String satChgUser;

    @Column(name="SAT_CHGDATE" )
    private Date satChgDate;

    @Column(name="SAT_CODE_PBRK" ,length=40)
    private String satCodePbrk;
}
