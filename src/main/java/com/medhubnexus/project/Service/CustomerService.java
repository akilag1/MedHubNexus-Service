package com.medhubnexus.project.Service;

import com.medhubnexus.project.Dao.CustomerDao;
import com.medhubnexus.project.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerDao customerDao;

    public List<Customer> getAllCustomers() {
        return customerDao.findAll();
    }

    public Customer getCustomerById(int id) { return customerDao.findById(id).get(); }

    public void createCustomer(Customer customer) { customerDao.save(customer); }

    public String updateCustomer(Customer customer) {
        Optional<Customer> existCustomer = customerDao.findById(customer.getId());
        if (existCustomer.isPresent()){
            Customer customer1 = existCustomer.get();
            customer1.setUserName(customer.getUserName());
            customer1.setPassword(customer.getPassword());
            customerDao.save(customer1);
            return "Updated Successfully";
        }
        return "The Customer Not Exists";
    }
}
