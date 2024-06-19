package com.master.accmaster.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.accmaster.model.VBahanBeli;
import com.master.accmaster.repository.IVBahanBeliRepository;

@Service
public class ServiceVBahanBeli {
	@Autowired
	IVBahanBeliRepository repoVBblBhn;
	
	public List<VBahanBeli> getVBblBhnList(){
		return repoVBblBhn.findAll();
	}
	
	 public String getSupplierDesc(String bhncode) {
		 return repoVBblBhn.getSupplierDesc(bhncode);
	 }
	

}
