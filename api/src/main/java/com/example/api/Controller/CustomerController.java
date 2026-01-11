package com.example.api.Controller;
import com.example.api.Model.Customer;
import com.example.api.Services.CustomerService;
import lombok.RequiredArgsConstructor;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {
    @Autowired
    private CustomerService service;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return service.getmethodList();
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return service.save(customer);
    }
}