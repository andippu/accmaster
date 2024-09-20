package com.master.accmaster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.master.accmaster.model.Kurs;
import com.master.accmaster.service.ServiceKurs;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerKurs {
	@Autowired
	ServiceKurs servKurs;
	
	@GetMapping("/kurs/getkurswithout")
	public List<Kurs> getkursWithOutList (String kurscd){
		return servKurs.getkursWithOutList(kurscd);
	}
}
