package com.master.accmaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.master.accmaster.model.UploadLogErrors;
import com.master.accmaster.model.UploadLogErrorsCompKey;


import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IUploadLogErrors extends JpaRepository<UploadLogErrors,UploadLogErrorsCompKey>{
	 @Query(value = "SELECT to_char(max(UPLOG_ID)) FROM UPLOAD_LOG_ERROR S WHERE S.UPLOAD_TYPE=?1",nativeQuery = true)
	    public String getMaxError(String type);

}
