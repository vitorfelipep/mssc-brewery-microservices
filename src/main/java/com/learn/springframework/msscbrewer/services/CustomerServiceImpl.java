package com.learn.springframework.msscbrewer.services;

import com.learn.springframework.msscbrewer.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto findCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(customerId)
                .name("João da Couves")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(customerDto.getId())
                .name(customerDto.getName())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.info("Update customer...");
    }

    @Override
    public void deleteById(UUID customerId) {
        log.info("Deleting customer by id: " + customerId);
    }
}
