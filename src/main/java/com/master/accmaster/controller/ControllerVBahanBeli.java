package com.master.accmaster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.master.accmaster.model.BahanBakuBeli;
import com.master.accmaster.model.VBahanBeli;
import com.master.accmaster.service.ServiceBahanBakuBeli;
import com.master.accmaster.service.ServiceVBahanBeli;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerVBahanBeli {
	@Autowired
	ServiceVBahanBeli servVBblBhn;
	
	@GetMapping("/bahanbeli/vbahanBeli")
	public List<VBahanBeli> getVBblBhnList(){
		return servVBblBhn.getVBblBhnList();
	}
	
	@GetMapping("/bahanbeli/vbahanBelidesc")
	 public String getSupplierDesc(String bhncode) {
		 return servVBblBhn.getSupplierDesc(bhncode);
	 }

}
