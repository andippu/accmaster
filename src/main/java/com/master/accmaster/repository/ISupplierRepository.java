package com.master.accmaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.master.accmaster.model.Supplier;

import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface ISupplierRepository extends JpaRepository<Supplier, Integer> {
	
	@Query(value="select s.supName from Supplier s where s.supId=?1")
    public String getSupName(String supid);

}

