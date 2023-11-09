package com.medhubnexus.project.Controller;

import com.medhubnexus.project.Model.Customer;
import com.medhubnexus.project.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("all")
    public ResponseEntity<List<Customer>> getAllcustomers(){
        try {
            return new ResponseEntity<>(customerService.getAllCustomers(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("customer/{id}")
    public ResponseEntity<Customer> getCustomerBYId(@PathVariable("id") int id){ //http://localhost:8080/customer/customer/2
        try {
            return new ResponseEntity<>(customerService.getCustomerById(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(new Customer(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("create")
    public ResponseEntity<String> createCustomer(@RequestBody Customer customer){
        try {
            customerService.createCustomer(customer);
            return new ResponseEntity<>("Create Success", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("Creation Fail", HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("updateCustomer")
    public ResponseEntity<String> updateCustomer(@RequestBody Customer customer){
        try {
            return new ResponseEntity<>(customerService.updateCustomer(customer), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(customerService.updateCustomer(customer), HttpStatus.BAD_REQUEST);
        }
    }
}
