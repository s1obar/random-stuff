package com.example.domain.service;

import com.example.controller.globalexception.UserNotFoundException;
import com.example.domain.model.User;
import com.example.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User getUserById(Long id) throws UserNotFoundException{
        return userRepository.getUserById(id);
    }
}
