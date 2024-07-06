package com.master.accmaster.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.master.accmaster.model.UploadLogErrors;
import com.master.accmaster.service.ServiceUploadLogErrors;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerUploadLogErros {
	@Autowired
	ServiceUploadLogErrors servLogs;
	
	@GetMapping("/uplerr/getmaxerr")
	public String getMaxError(String type) {
		return servLogs.getMaxError(type);
	}
	
	@GetMapping("/uplerr/getlogerrList")
	public List<UploadLogErrors> getLogErrList(){
		return servLogs.getLogErrList();
	}

}
