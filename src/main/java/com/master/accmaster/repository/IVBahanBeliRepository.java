package com.master.accmaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.master.accmaster.model.BahanBakuBeli;
import com.master.accmaster.model.VBahanBeli;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IVBahanBeliRepository extends JpaRepository<VBahanBeli, String> {
	
	@Query(value="select s.VBblDesc from VBahanBeli s where s.VBblCode=?1")
    public String getSupplierDesc(String bhncode);

}
