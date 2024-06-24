package com.master.accmaster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.master.accmaster.model.BahanKemasBeli;
import com.master.accmaster.service.ServiceBahanKemasBeli;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerBahanKemasBeli {
	
	@Autowired
	ServiceBahanKemasBeli serKemas;

    @GetMapping("/kemasbeli/getbkdesc")
    public String getBbName(String bkCode){
        String brname= serKemas.getBkDesc(bkCode);
        return brname;
    }

    @GetMapping("/kemasbeli/getallkemasbeli")
    public List<BahanKemasBeli> getAllKemasBeli() {
        return serKemas.getAllKemasBeli();
    }
    
    


}
