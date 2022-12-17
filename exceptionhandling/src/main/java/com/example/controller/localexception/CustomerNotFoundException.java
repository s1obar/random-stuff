package com.example.controller.localexception;

public class CustomerNotFoundException extends Exception {
    public CustomerNotFoundException(String message){
        super(message);
    }
}
