package com.master.accmaster.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.master.accmaster.service.ServiceTUploadFiles;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerTUploadFiles {
	@Autowired 
	ServiceTUploadFiles servtufl;
	
	@PostMapping("/upfiles/saveuploadfile")
    public void uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
		servtufl.saveFile(file);
    }
	
	@PostMapping("/upfiles/saveuploadfilepnp")
    public void uploadFilepnp(@RequestParam("file") MultipartFile file) throws IOException {
		servtufl.saveFilePNP(file);
    }

}
