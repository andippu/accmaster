package com.master.accmaster.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.accmaster.model.Supplier;
import com.master.accmaster.repository.ISupplierRepository;

import java.util.List;

@Service
public class ServiceSupplier {
	@Autowired
	ISupplierRepository repoSupp;
	
	public List<Supplier> getsupplierList(){
		return repoSupp.findAll();
	}
	
	public String getSupNames(String supid){
	      String supname =  repoSupp.getSupName(supid);
	      return supname;
	    }

}
