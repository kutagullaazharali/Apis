package com.example.api.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.Model.Customer;
import com.example.api.Repository.CustomerRepository;

@Service
public class CustomerService {
    // instance method to return all customers
    @Autowired
    private CustomerRepository repo;

    public List<Customer> findAll() {
        return repo.findAll();
    }

    public Customer save(Customer customer) {
        return repo.save(customer);
    }
}