package com.master.accmaster.repository;



import com.master.accmaster.model.Barang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IBarangRepository extends JpaRepository<Barang,String> {

    @Query(value="select s.brName from Barang s where s.brCode=?1")
    public String getBrName(String brCode);




}
