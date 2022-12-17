package com.example.domain.service;

import com.example.controller.globalexception.UserNotFoundException;
import com.example.controller.localexception.CustomerNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class CustomerService {
    private final List<String> CUSTOMERS = Arrays.asList("Jane", "Jack", "Donald");

    public String getCustomerByName(String name) throws CustomerNotFoundException {
        boolean customersListContainsName = CUSTOMERS.stream().map(String::toLowerCase).toList().contains(name.toLowerCase());

        if (customersListContainsName){
            return name;
        }

        log.info("Invalid customer name: {}.", name);
        throw new CustomerNotFoundException("Customer does not exist.");
    }
}
