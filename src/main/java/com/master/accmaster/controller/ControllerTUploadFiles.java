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
	
	@PostMapping("/upfiles/saveuploadfilepbo")
    public void uploadFilepbo(@RequestParam("file") MultipartFile file) throws IOException {
		servtufl.saveFilePBO(file);
    }
	
	@PostMapping("/upfiles/saveuploadfilevph")
    public void uploadFilevph(@RequestParam("file") MultipartFile file) throws IOException {
		servtufl.saveFileVPH(file);
    }
	
	@PostMapping("/upfiles/saveuploadfilettb")
    public void uploadFilettb(@RequestParam("file") MultipartFile file) throws IOException {
		servtufl.saveFileTTB(file);
    }

	@PostMapping("/upfiles/saveuploadfilevpj")
    public void uploadFileVPJ(@RequestParam("file") MultipartFile file) throws IOException {
		servtufl.saveFileVPJ(file);
    }
	
	@PostMapping("/upfiles/saveuploadfilelph")
    public void uploadFileLPH(@RequestParam("file") MultipartFile file) throws IOException {
		servtufl.saveFileLPH(file);
    }
	
	@PostMapping("/upfiles/saveuploadfiletb1")
    public void uploadFiletb1(@RequestParam("file") MultipartFile file) throws IOException {
		servtufl.saveFileTB1(file);
    }
	
	@PostMapping("/upfiles/saveuploadfiletb2")
    public void uploadFiletb2(@RequestParam("file") MultipartFile file) throws IOException {
		servtufl.saveFileTB2(file);
    }
}
