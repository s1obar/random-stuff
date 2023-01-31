package com.example.jwt.domain.repository;

import com.example.jwt.domain.model.User;
import com.example.jwt.infrastructure.jpa.entity.UserEntity;
import com.example.jwt.infrastructure.jpa.repository.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UsersRepository {
    private final UserJpaRepository userJpaRepository;
    public void save(User user) {
        userJpaRepository.save(mapToUserEntity(user));
    }

    private UserEntity mapToUserEntity(User user){
        return UserEntity.builder()
                .email(user.getEmail())
                .password(user.getPassword())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .build();
    }

    public Optional<Object> findByEmail(String eMail) {
        
    }
}
