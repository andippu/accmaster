package com.master.accmaster.service;

import com.master.accmaster.repository.ISatuanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceSatuan {
    @Autowired
    ISatuanRepository repoSatuan;

    public String getSatDescs(String brSat){
        String sat= repoSatuan.getSatDesc(brSat);
        return sat;
    }

}
