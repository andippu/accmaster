package com.master.accmaster.service;

import com.master.accmaster.model.Barang;
import com.master.accmaster.model.TaxSetup;
import com.master.accmaster.repository.IBarangRepository;
import com.master.accmaster.repository.ITaxSetup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTaxSetup {
	@Autowired
	ITaxSetup repoTS;
	
	public List<TaxSetup> GetVatPpn(String td){
		return repoTS.findByTaxId(td);
	}
	
	
}
