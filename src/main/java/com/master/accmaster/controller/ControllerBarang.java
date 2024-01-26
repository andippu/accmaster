package com.master.accmaster.controller;
import com.master.accmaster.model.Barang;
import com.master.accmaster.service.ServiceBarang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerBarang {
    @Autowired
    ServiceBarang serBrg;

    @GetMapping("/brg/getBrgName")
    public String getBrNames(String brCode){
        String brname= serBrg.getBrNames(brCode);
        return brname;
    }

    @GetMapping("/brg/getallProd")
    public List<Barang> getAllProduct() {
        return serBrg.getAllProduct();
    }

}
