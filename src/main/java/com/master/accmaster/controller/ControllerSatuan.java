package com.master.accmaster.controller;

import com.master.accmaster.service.ServiceSatuan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerSatuan {
    @Autowired
    ServiceSatuan servSat;

    @GetMapping("/sat/getsatdesc")
    public String getSatDescs(String brSat) {
        String sat = servSat.getSatDescs(brSat);
        return sat;
    }
}
