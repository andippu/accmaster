package com.master.accmaster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.master.accmaster.model.Supplier;
import com.master.accmaster.service.ServiceSupplier;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerSupplier {
	@Autowired
	ServiceSupplier servSupp;
	
	@GetMapping("/supplier/getsupplierList")
	public List<Supplier> getsupplierList(){
		return servSupp.getsupplierList();
	}
	
	@GetMapping("/supplier/getsupname")
    public String getSuppName(String supid){
        String supname= servSupp.getSupNames(supid);
        return supname;
    }
	
}
