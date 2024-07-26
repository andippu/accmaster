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
	
	public void saveFilePBO(MultipartFile file) throws IOException {
		TUploadFiles fileEntity = new TUploadFiles();
		fileEntity.setTuflName(file.getOriginalFilename());
		fileEntity.setTuflType("PBO");
		fileEntity.setTuflFiles(file.getBytes());
		repotufl.save(fileEntity);
    }
	
	public void saveFileVPH(MultipartFile file) throws IOException {
		TUploadFiles fileEntity = new TUploadFiles();
		fileEntity.setTuflName(file.getOriginalFilename());
		fileEntity.setTuflType("VPH");
		fileEntity.setTuflFiles(file.getBytes());
		repotufl.save(fileEntity);
    }
	
	public void saveFileTTB(MultipartFile file) throws IOException {
		TUploadFiles fileEntity = new TUploadFiles();
		fileEntity.setTuflName(file.getOriginalFilename());
		fileEntity.setTuflType("TBO");
		fileEntity.setTuflFiles(file.getBytes());
		repotufl.save(fileEntity);
    }
	
	public void saveFileVPJ(MultipartFile file) throws IOException {
		TUploadFiles fileEntity = new TUploadFiles();
		fileEntity.setTuflName(file.getOriginalFilename());
		fileEntity.setTuflType("VPJ");
		fileEntity.setTuflFiles(file.getBytes());
		repotufl.save(fileEntity);
    }
	
	public void saveFileLPH(MultipartFile file) throws IOException {
		TUploadFiles fileEntity = new TUploadFiles();
		fileEntity.setTuflName(file.getOriginalFilename());
		fileEntity.setTuflType("LPH");
		fileEntity.setTuflFiles(file.getBytes());
		repotufl.save(fileEntity);
    }
	
	public void saveFileTB1(MultipartFile file) throws IOException {
		TUploadFiles fileEntity = new TUploadFiles();
		fileEntity.setTuflName(file.getOriginalFilename());
		fileEntity.setTuflType("TB1");
		fileEntity.setTuflFiles(file.getBytes());
		repotufl.save(fileEntity);
    }
	
	public void saveFileTB2(MultipartFile file) throws IOException {
		TUploadFiles fileEntity = new TUploadFiles();
		fileEntity.setTuflName(file.getOriginalFilename());
		fileEntity.setTuflType("TB2");
		fileEntity.setTuflFiles(file.getBytes());
		repotufl.save(fileEntity);
    }
	
	public void saveFileTujud(MultipartFile file) throws IOException {
		TUploadFiles fileEntity = new TUploadFiles();
		fileEntity.setTuflName(file.getOriginalFilename());
		fileEntity.setTuflType("JUD");
		fileEntity.setTuflFiles(file.getBytes());
		repotufl.save(fileEntity);
    }
	
	public void saveFileVPM(MultipartFile file) throws IOException {
		TUploadFiles fileEntity = new TUploadFiles();
		fileEntity.setTuflName(file.getOriginalFilename());
		fileEntity.setTuflType("VPM");
		fileEntity.setTuflFiles(file.getBytes());
		repotufl.save(fileEntity);
    }
	
	public void saveFileVEXP(MultipartFile file) throws IOException {
		TUploadFiles fileEntity = new TUploadFiles();
		fileEntity.setTuflName(file.getOriginalFilename());
		fileEntity.setTuflType("VEX");
		fileEntity.setTuflFiles(file.getBytes());
		repotufl.save(fileEntity);
    }
	
	public void saveFileVPY(MultipartFile file) throws IOException {
		TUploadFiles fileEntity = new TUploadFiles();
		fileEntity.setTuflName(file.getOriginalFilename());
		fileEntity.setTuflType("VPY");
		fileEntity.setTuflFiles(file.getBytes());
		repotufl.save(fileEntity);
    }
	
	public void saveFileVUC(MultipartFile file) throws IOException {
		TUploadFiles fileEntity = new TUploadFiles();
		fileEntity.setTuflName(file.getOriginalFilename());
		fileEntity.setTuflType("VUC");
		fileEntity.setTuflFiles(file.getBytes());
		repotufl.save(fileEntity);
    }
	
	

}
