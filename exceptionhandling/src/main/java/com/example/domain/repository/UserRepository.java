package com.example.domain.repository;

import com.example.controller.globalexception.UserNotFoundException;
import com.example.domain.model.User;
import com.example.infrastructure.jpa.entity.UserEntity;
import com.example.infrastructure.jpa.repository.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final UserJpaRepository userJpaRepository;

    public User getUserById(Long id) throws UserNotFoundException {
        UserEntity userEntity = userJpaRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User does not exist in db."));
        return mapFromEntity(userEntity);
    }

    private User mapFromEntity(UserEntity userEntity) {
        return User.builder().id(userEntity.getId()).name(userEntity.getName()).build();
    }
}
