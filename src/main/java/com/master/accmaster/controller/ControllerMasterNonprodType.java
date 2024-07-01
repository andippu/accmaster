package com.master.accmaster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.master.accmaster.model.MasterNonprodType;
import com.master.accmaster.service.ServiceMasterNonprodType;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerMasterNonprodType {
	
	@Autowired
	ServiceMasterNonprodType serNonProd;

    @GetMapping("/brg/getnonprodname")
    public String getNonProdNames(String code){
        String prname= serNonProd.getTypeProdNames(code);
        return prname;
    }

    @GetMapping("/brg/getallnonprod")
    public List<MasterNonprodType> getAllNonProd() {
        return serNonProd.getAllNonProd();
    }

}
