package com.example.demo.domain.service;

import com.example.demo.controller.exception.ApiRequestException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {

    private final List<String> CUSTOMERS = Arrays.asList("Jane", "Jack", "Donald");

    public List<String> getAll() {
        return CUSTOMERS;
    }

    public String getCustomerByName(String name){
        if (CUSTOMERS.stream().map(String::toLowerCase).toList().contains(name.toLowerCase())){
            return name;
        }else{
           throw new ApiRequestException("Customer does not exist.");
        }
    }
}
