package com.example.demo.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/customers", produces="application/json")
public class CustomersController {

    private final List<String> CUSTOMERS = Arrays.asList("Jane", "Jack", "Donald");

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Fetches all customers from db.",
            notes = "Dummy data used at the moment.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success"),
    })
    public List<String> getAllCustomers(){
        return CUSTOMERS;
    }

    @GetMapping(value = "/customer/{name}")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Fetches specific customer by name from db.",
            notes = "Dummy data used at the moment.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Not found")
    })
    public ResponseEntity<String> getCustomerByName(@PathVariable String name){
        if(CUSTOMERS.stream().map(String::toLowerCase).toList().contains(name.toLowerCase())){
            return new ResponseEntity<>(name, HttpStatus.OK);
        }
        return new ResponseEntity<>("We do not have that customer in our database!", HttpStatus.NOT_FOUND);
    }
}
