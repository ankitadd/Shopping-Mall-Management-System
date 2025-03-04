package com.app.service;

import java.util.List;

import com.app.entity.Customer;

public interface CustomerService {
    
    List<Customer> findAll();

    Customer findById(int id);

    Customer save(Customer customer);

    void deleteById(int id);
}
