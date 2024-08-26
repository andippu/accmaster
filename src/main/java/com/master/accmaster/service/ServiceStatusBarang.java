package com.master.accmaster.service;


import com.master.accmaster.model.Satuan;
import com.master.accmaster.model.StatusBarang;
import com.master.accmaster.repository.ISatuanRepository;
import com.master.accmaster.repository.IStatusBarangRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceStatusBarang {
	@Autowired
	IStatusBarangRepository repoStBrg;
	
	public List<StatusBarang> getStatBrgList (){
		return repoStBrg.findAll();
	}
	
}
