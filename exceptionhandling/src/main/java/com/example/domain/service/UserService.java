package com.example.domain.service;

import com.example.controller.globalexception.UserNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class UserService {
    private final List<String> USERS = Arrays.asList("Aurora", "Antonija", "Manuela");

    public String getUserByName(String name) throws UserNotFoundException{
        boolean usersListContainsName = USERS.stream().map(String::toLowerCase).toList().contains(name.toLowerCase());

        if (usersListContainsName){
            return name;
        }

        log.info("Invalid user name: {}.", name);
        throw new UserNotFoundException("User does not exist.");
    }
}
