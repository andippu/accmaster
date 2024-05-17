package com.master.accmaster.repository;

import com.master.accmaster.model.Satuan;
import com.master.accmaster.model.TaxSetup;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
public interface ITaxSetup extends JpaRepository<TaxSetup, String> {
	
	public List<TaxSetup> findByTaxId(String td);

}
