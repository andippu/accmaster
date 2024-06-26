package com.master.accmaster.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.accmaster.model.MasterNonprodType;
import com.master.accmaster.repository.IMasterNonprodTypeRepository;


@Service
public class ServiceMasterNonprodType {
	
	@Autowired
	IMasterNonprodTypeRepository repoNonProd;

    public String getTypeProdNames(String code){
      String prname=  repoNonProd.getTypeProdName(code);
      return prname;
    }

    public List<MasterNonprodType> getAllNonProd(){
        return repoNonProd.findAll();
    }

}
