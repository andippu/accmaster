package com.master.accmaster.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.accmaster.model.BahanKemasBeli;
import com.master.accmaster.repository.IBahanKemasBeliRepository;

@Service
public class ServiceBahanKemasBeli {
	
	@Autowired
	IBahanKemasBeliRepository repoKemas;
	
	public String getBkDesc(String bkCode){
	      String brname=  repoKemas.getKemasDesc(bkCode);
	      return brname;
	    }

    public List<BahanKemasBeli> getAllKemasBeli(){
	        return repoKemas.findAll();
	    }

}
