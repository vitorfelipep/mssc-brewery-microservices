package com.learn.springframework.msscbrewer.services;

import com.learn.springframework.msscbrewer.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto findCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteById(UUID customerId);
}
