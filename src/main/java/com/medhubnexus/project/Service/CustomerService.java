package com.medhubnexus.project.Service;

import com.medhubnexus.project.Dao.CustomerDao;
import com.medhubnexus.project.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerDao customerDao;

    public List<Customer> getAllCustomers() {
        return customerDao.findAll();
    }

    public Customer getCustomerById(int id) { return customerDao.findById(id).get(); }

}
