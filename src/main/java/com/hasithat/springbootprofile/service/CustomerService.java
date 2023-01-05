package com.hasithat.springbootprofile.service;

import com.hasithat.springbootprofile.dto.CustomerResponseDTO;
import com.hasithat.springbootprofile.entity.Customer;
import com.hasithat.springbootprofile.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Value("${application.message}")
    private String activeProfile;

    @PostConstruct
    public void printEnvDetails(){
        System.out.println("*************** activeProfile "+activeProfile);
    }

    public List<Customer> saveAllCustomers(List<Customer> customers){
        return customerRepository.saveAll(customers);
    }

    public List<CustomerResponseDTO> getAllCustomers(){
        List<Customer> customers=customerRepository.findAll();
        return customers.stream().map(customer -> new CustomerResponseDTO(customer.getId(), customer.getName(), customer.getEmail(), customer.getPhone(), this.convertDateFormat(customer.getDob()))).collect(Collectors.toList());
    }

    private String convertDateFormat(Date date){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate= formatter.format(date);
        return strDate;
    }




}
