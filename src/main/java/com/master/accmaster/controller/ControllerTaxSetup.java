package com.master.accmaster.controller;

import com.master.accmaster.model.Barang;
import com.master.accmaster.model.TaxSetup;
import com.master.accmaster.service.ServiceBarang;
import com.master.accmaster.service.ServiceTaxSetup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerTaxSetup {
	@Autowired
	ServiceTaxSetup servTS;
	
	@GetMapping("/tax/getppnvat")
	public List<TaxSetup> GetPPnVat(String td){
		return servTS.GetVatPpn(td);
	}
	
	

}
