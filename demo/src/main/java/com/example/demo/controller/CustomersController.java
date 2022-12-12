package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class CustomersController {

    private final List<String> CUSTOMERS = Arrays.asList("Jane", "Jack", "Donald");

    @GetMapping("/all-customers")
    @ResponseStatus(HttpStatus.OK)
    public List<String> getAllCustomers(){
        return CUSTOMERS;
    }

    @GetMapping(value = "/customer/{name}")
    @ResponseStatus(HttpStatus.OK)
    public String getCustomerByLastName(@PathVariable String name){
        if(CUSTOMERS.stream().map(String::toLowerCase).toList().contains(name.toLowerCase())){
            return name;
        }
        return "We do not have that customer in our database!";
    }
}
