package com.master.accmaster.controller;

import com.master.accmaster.model.Satuan;
import com.master.accmaster.model.StatusBarang;
import com.master.accmaster.service.ServiceSatuan;
import com.master.accmaster.service.ServiceStatusBarang;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerStatusBarang {
	@Autowired
	ServiceStatusBarang servStatBrg;
	
	@GetMapping("/stat/getstatbrg")
	public List<StatusBarang> getStatBrgList (){
		return servStatBrg.getStatBrgList();

	}
	
	
}
