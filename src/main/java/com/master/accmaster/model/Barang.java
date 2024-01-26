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
@Table(name= "BARANG")
public class Barang {

    @Id
    @Column(name="BR_CODE" ,length=6, nullable = false)
    private String brCode;

    @Column (name="BR_NAME" ,length=50, nullable = false)
    private String brName;

    @Column (name="BR_STB_CODE" ,length=4)
    private String brStbCode;

    @Column (name="BR_LIS_CODE" ,length=4)
    private String brLisCode;

    @Column (name="BR_JB_CODE" ,length=4)
    private String brJbCode;

    @Column (name="BR_SAT_CODE" ,length=50)
    private String brSatCode;

    @Column (name="BR_HARGA_PK" )
    private Integer brHargaPk;

    @Column (name="BR_CHGUSER" ,length=40)
    private String brChgUser;

    @Column (name="BR_CHGDATE" ,length=40)
    private Date brChgDate;

    @Column (name="BR_STATUS" ,length=40)
    private String brStatus;

    @Column (name="BERAT_KARTON" )
    private Integer beratKarton;

    @Column (name="BR_KATEGORI" ,length=40)
    private String brKategori;

    @Column (name="BR_STDOUTPUT" )
    private Integer brStdOutput;

    @Column (name="TOLL_FEE" )
    private Integer tollFee;

    @Column (name="BR_HARGA_GN" )
    private Integer brHargaGn;


}
