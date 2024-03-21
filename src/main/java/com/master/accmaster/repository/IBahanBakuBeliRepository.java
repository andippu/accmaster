package com.master.accmaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.master.accmaster.model.BahanBakuBeli;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IBahanBakuBeliRepository extends JpaRepository<BahanBakuBeli,String> {
	
	@Query(value="select s.BbbDesc from BahanBakuBeli s where s.BbbCode=?1")
    public String getBakuDesc(String bbCode);

}
