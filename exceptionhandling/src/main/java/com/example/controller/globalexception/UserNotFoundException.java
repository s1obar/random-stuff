package com.example.controller.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.EntityNotFoundException;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}
