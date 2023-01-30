package com.example.auth;

import com.example.model.AuthenticationRequest;
import com.example.model.AuthenticationResponse;
import com.example.model.RegisterRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthenticationController {
    @PostMapping
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest registerRequest){

    }

    @PostMapping
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest authenticationRequest){

    }
}
