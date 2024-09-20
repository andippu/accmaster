package com.master.accmaster.service;

import com.master.accmaster.model.Kurs;
import com.master.accmaster.repository.IKursRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ServiceKurs {
	  @Autowired
	IKursRepository repoKurs;
	  
	 
	
	public List<Kurs> getkursWithOutList (String kurscd){
		return repoKurs.findByKursDescNotLike(kurscd);
	}

}
