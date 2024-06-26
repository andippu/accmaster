package com.master.accmaster.model;

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
@Table(name= "MASTER_NONPROD_TYPE")
public class MasterNonprodType {
	
	@Id
    @Column(name="MNT_ID" ,length=10, nullable = false)
    private String mntId;

    @Column (name="MNT_DESC" ,length=100)
    private String mntDesc;

}
