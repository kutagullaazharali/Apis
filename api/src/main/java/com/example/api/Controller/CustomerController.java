package com.example.api.Controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.ApiResponse;
import com.example.api.Model.Customer;
import com.example.api.Services.CustomerService;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {
    @Autowired
    private CustomerService service;

    @GetMapping
    public ApiResponse<List<Customer>> getAllCustomers() {
        List<Customer> customers = service.findAll();
        return new ApiResponse<>("success", customers.size(), customers);
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        customer.setCreatedAt(LocalDateTime.now());
        return service.save(customer);
    }
}