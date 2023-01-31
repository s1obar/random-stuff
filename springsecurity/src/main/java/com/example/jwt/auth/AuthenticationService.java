package com.example.jwt.auth;

import com.example.jwt.enums.Role;
import com.example.jwt.model.AuthenticationResponse;
import com.example.jwt.model.RegisterRequest;
import com.example.jwt.repository.UserRepository;
import com.example.jwt.model.AuthenticationRequest;
import com.example.jwt.model.User;
import com.example.jwt.service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authManager;

    public AuthenticationResponse register(RegisterRequest registerRequest) {
        var user = User.builder()
                .firstName(registerRequest.getFirstName())
                .lastName(registerRequest.getLastName())
                .email(registerRequest.getEMail())
                .password(passwordEncoder.encode(registerRequest.getPassword()))
                .role(Role.USER)
                .build();

        repository.save(user);
        var jwt = jwtService.generateToken(user);

        return AuthenticationResponse.builder().token(jwt).build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest authenticationRequest) {
        authManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        authenticationRequest.getEMail(),
                        authenticationRequest.getPassword()
                )
        );

        var user = repository.findByEmail(authenticationRequest.getEMail()).orElseThrow();
        var jwt = jwtService.generateToken(user);

        return AuthenticationResponse.builder().token(jwt).build();
    }
}
