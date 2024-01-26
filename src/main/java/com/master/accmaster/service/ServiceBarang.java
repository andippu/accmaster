package com.master.accmaster.service;

import com.master.accmaster.model.Barang;
import com.master.accmaster.repository.IBarangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceBarang {

    @Autowired
    IBarangRepository repoBrg;

    public String getBrNames(String brCode){
      String brname=  repoBrg.getBrName(brCode);
      return brname;
    }

    public List<Barang> getAllProduct(){
        return repoBrg.findAll();
    }


}
