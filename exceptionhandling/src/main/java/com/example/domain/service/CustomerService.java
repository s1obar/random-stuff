package com.example.domain.service;

import com.example.controller.localexception.CustomerNotFoundException;
import com.example.domain.model.Customer;
import com.example.domain.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    public Customer getCustomerById(Long id) throws CustomerNotFoundException {
        return customerRepository.getCustomerById(id);
    }
}
