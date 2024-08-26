package com.master.accmaster.repository;

import com.master.accmaster.model.Satuan;
import com.master.accmaster.model.StatusBarang;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IStatusBarangRepository  extends JpaRepository<StatusBarang, String> {
	
}
