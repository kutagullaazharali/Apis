package com.example.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.Model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
