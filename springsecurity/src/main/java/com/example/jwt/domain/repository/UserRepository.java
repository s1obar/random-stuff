package com.example.jwt.domain.repository;

import com.example.jwt.domain.model.User;
import com.example.jwt.infrastructure.jpa.entity.UserEntity;
import com.example.jwt.infrastructure.jpa.repository.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepository {
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
                .role(user.getRole())
                .build();
    }

    public User findByEmail(String eMail) {
        UserEntity userEntity = userJpaRepository.findByEmail(eMail).orElseThrow(() -> new UsernameNotFoundException("User not found!"));

        return mapFromUserEntity(userEntity);
    }

    private User mapFromUserEntity(UserEntity entity){
        return User.builder()
                .email(entity.getEmail())
                .password(entity.getPassword())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .role(entity.getRole())
                .build();
    }
}
