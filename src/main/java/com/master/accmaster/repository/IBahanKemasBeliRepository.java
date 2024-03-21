package com.master.accmaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.master.accmaster.model.BahanKemasBeli;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IBahanKemasBeliRepository extends JpaRepository<BahanKemasBeli,String> {
	
	@Query(value="select s.BbkDesc from BahanKemasBeli s where s.BbkCode=?1")
    public String getKemasDesc(String bkCode);

}
