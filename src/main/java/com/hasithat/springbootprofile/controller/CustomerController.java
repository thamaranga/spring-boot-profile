package com.hasithat.springbootprofile.controller;

import com.hasithat.springbootprofile.dto.CustomerResponseDTO;
import com.hasithat.springbootprofile.entity.Customer;
import com.hasithat.springbootprofile.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping
    public List<Customer> saveCustomers(@RequestBody List<Customer> customers){
        return customerService.saveAllCustomers(customers);
    }

    @GetMapping
    public List<CustomerResponseDTO> getAllCustomers(){
        return customerService.getAllCustomers();
    }


}
