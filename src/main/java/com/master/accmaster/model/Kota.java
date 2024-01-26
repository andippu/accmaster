package com.master.accmaster.model;

import java.util.Date;
import java.util.UUID;
import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "KOTA")
public class Kota {

    @Id
    @Column (name="KT_CODE" ,length=20, nullable = false)
    private String ktCode;

    @Column (name="KT_DESC" ,length=60, nullable = false)
    private String ktDesc;

    @Column (name="KT_CHGUSER" ,length=40)
    private String ktChgUser;

    @Column (name="KT_CHGDATE" )
    private Date ktChgDate;

}
