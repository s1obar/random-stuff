package com.example.demo.domain.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private final List<String> USERS = Arrays.asList("Aurora", "Antonija", "Manuela");
    public String getUserByName(String name){
        if (USERS.stream().map(String::toLowerCase).toList().contains(name.toLowerCase())){
            return name;
        }else{
            return "";
        }
    }
}
