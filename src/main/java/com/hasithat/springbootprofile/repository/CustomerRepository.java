package com.hasithat.springbootprofile.repository;

import com.hasithat.springbootprofile.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
