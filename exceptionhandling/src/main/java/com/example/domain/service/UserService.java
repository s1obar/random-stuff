package com.example.domain.service;

import com.example.controller.globalexception.UserNotFoundException;
import com.example.domain.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class UserService {
    private final List<User> USERS = Arrays.asList(
            User.builder().id(1L).name("Aurora").build(),
            User.builder().id(2L).name("Antonija").build(),
            User.builder().id(3L).name("Manuela").build());

    public List<User> getUserByName(String name) throws UserNotFoundException{
        List<User> usersWithWantedName = USERS.stream().filter(user -> user.name().toLowerCase().equals(name)).toList();

        if (!usersWithWantedName.isEmpty()){
            return usersWithWantedName;
        }

        log.info("Invalid user name: {}.", name);
        throw new UserNotFoundException("User does not exist.");
    }
}
