package com.master.accmaster.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.accmaster.model.BahanBakuBeli;
import com.master.accmaster.repository.IBahanBakuBeliRepository;

@Service
public class ServiceBahanBakuBeli {
	
	@Autowired
	IBahanBakuBeliRepository repoBaku;
	
	public String getBbDesc(String bbCode){
	      String brname=  repoBaku.getBakuDesc(bbCode);
	      return brname;
	}

	public List<BahanBakuBeli> getAllBakuBeli(){
	      return repoBaku.findAll();
	}

}
