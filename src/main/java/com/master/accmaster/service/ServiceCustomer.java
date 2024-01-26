package com.master.accmaster.service;

import com.master.accmaster.model.Customer;
import com.master.accmaster.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCustomer {
    @Autowired
    ICustomerRepository repoCust;

    public List<Customer> getAllCustomer() {
        return repoCust.findAllCust();
    }

    public String getCusName(String cusno){
        return repoCust.findCustName(cusno);
    }


}