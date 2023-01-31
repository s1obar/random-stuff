package com.example.jwt.domain.service.auth;

import com.example.jwt.domain.model.User;
import com.example.jwt.domain.repository.UserRepository;
import com.example.jwt.enums.Role;
import com.example.jwt.domain.model.AuthenticationResponse;
import com.example.jwt.domain.model.RegisterRequest;
import com.example.jwt.domain.model.AuthenticationRequest;
import com.example.jwt.domain.service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository userRepository;
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

        userRepository.save(user);
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

        var user = userRepository.findByEmail(authenticationRequest.getEMail());
        var jwt = jwtService.generateToken(user);

        return AuthenticationResponse.builder().token(jwt).build();
    }
}
