package com.master.accmaster.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.master.accmaster.model.TUploadFiles;

@Repository
public interface ITUploadFilesRepository extends JpaRepository<TUploadFiles,String> {

}
