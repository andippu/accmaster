package com.master.accmaster.repository;

import com.master.accmaster.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface ICustomerRepository  extends JpaRepository<Customer,String> {
    @Query("select s from Customer s order by s.cusName")
    public List<Customer> findAllCust();

    @Query("select s.cusName from Customer s where s.cusCode=?1")
    public String findCustName(String Custno);
}
