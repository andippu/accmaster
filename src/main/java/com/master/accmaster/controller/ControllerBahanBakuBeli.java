package com.master.accmaster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.master.accmaster.model.BahanBakuBeli;
import com.master.accmaster.service.ServiceBahanBakuBeli;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerBahanBakuBeli {
	
	@Autowired
	ServiceBahanBakuBeli serBaku;

    @GetMapping("/bakubeli/getbbdesc")
    public String getBbName(String bbCode){
        String brname= serBaku.getBbDesc(bbCode);
        return brname;
    }

    @GetMapping("/bakubeli/getallbakubeli")
    public List<BahanBakuBeli> getAllBakuBeli() {
        return serBaku.getAllBakuBeli();
    }

}
