package com.master.accmaster.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.master.accmaster.model.TUploadFiles;
import com.master.accmaster.repository.ITUploadFilesRepository;

import java.io.IOException;
import java.util.List;

@Service
public class ServiceTUploadFiles {
	@Autowired
	ITUploadFilesRepository repotufl;
	
	
	public void saveFile(MultipartFile file) throws IOException {
		TUploadFiles fileEntity = new TUploadFiles();
		fileEntity.setTuflName(file.getOriginalFilename());
		fileEntity.setTuflType("PPP");
		fileEntity.setTuflFiles(file.getBytes());
		repotufl.save(fileEntity);
    }
	
	public void saveFilePNP(MultipartFile file) throws IOException {
		TUploadFiles fileEntity = new TUploadFiles();
		fileEntity.setTuflName(file.getOriginalFilename());
		fileEntity.setTuflType("PNP");
		fileEntity.setTuflFiles(file.getBytes());
		repotufl.save(fileEntity);
    }
	
	
	

}
