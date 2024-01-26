package com.master.accmaster.controller;


import com.master.accmaster.model.Customer;
import com.master.accmaster.service.ServiceCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerCustomer {
    @Autowired
    ServiceCustomer servCust;

    @GetMapping("/cust/allcustomer")
    public List<Customer> getAllCustomer(){
        return servCust.getAllCustomer();
    }

    @GetMapping("/cust/getcustname")
    public String getCusName(String cusno){
        return servCust.getCusName(cusno);
    }
}
