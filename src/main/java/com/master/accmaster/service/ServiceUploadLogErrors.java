package com.master.accmaster.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.accmaster.model.UploadLogErrors;
import com.master.accmaster.repository.IUploadLogErrors;

import java.util.List;

@Service
public class ServiceUploadLogErrors {
	@Autowired
	IUploadLogErrors repoLogs;
	
	public String getMaxError(String type) {
		return repoLogs.getMaxError(type);
	}
	
	public List<UploadLogErrors> getLogErrList(String type){
		return repoLogs.findByUplerrTypeOrderByUplerrId(type);
	}
}
