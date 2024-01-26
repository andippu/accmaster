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
@Table(name= "STATUS_BARANG")
public class StatusBarang {

    @Id
    @Column(name="STB_CODE" ,length=20, nullable = false)
    private String stbCode;

    @Column (name="STB_DESC" ,length=60, nullable = false)
    private String stbDesc;

    @Column (name="STB_CHGUSER" ,length=40)
    private String stbChgUser;

    @Column (name="STB_CHGDATE" )
    private Date stbChgDate;

}
