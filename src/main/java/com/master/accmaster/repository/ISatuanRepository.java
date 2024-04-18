package com.master.accmaster.repository;

import com.master.accmaster.model.Satuan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin("http://localhost:4200")
public interface ISatuanRepository extends JpaRepository<Satuan,String> {

    @Query(value="select s.satDesc from Satuan s where s.satCode=?1")
    public String getSatDesc(String brCode);
    
    @Query(value="select s.satCode, s.satDesc from Satuan s ")
    public String getSatList();

}
