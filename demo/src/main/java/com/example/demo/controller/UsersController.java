package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class UsersController {

    private final List<String> USERS = Arrays.asList("Aurora", "Antonija", "Manuela");

    @GetMapping("/all-users")
    @ResponseStatus(HttpStatus.OK)
    public List<String> getAllUsers(){
        return USERS;
    }

    @GetMapping(value = "/user/{name}")
    @ResponseStatus(HttpStatus.OK)
    public String getUserByLastName(@PathVariable String name){
        if(USERS.stream().map(String::toLowerCase).toList().contains(name.toLowerCase())){
            return name;
        }
        return "We do not have that user in our database!";
    }
}
