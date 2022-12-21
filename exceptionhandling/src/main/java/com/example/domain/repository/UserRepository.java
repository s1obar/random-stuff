package com.example.domain.repository;

import com.example.controller.globalexception.UserNotFoundException;
import com.example.domain.model.User;
import com.example.infrastructure.jpa.entity.UserEntity;
import com.example.infrastructure.jpa.repository.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;


@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final UserJpaRepository userJpaRepository;

    @SneakyThrows
    public User getUserById(Long id) {
        UserEntity userEntity = userJpaRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User does not exist in db."));
        return mapFromEntity(userEntity);
    }

    private User mapFromEntity(UserEntity userEntity) {
        return User.builder().id(userEntity.getId()).name(userEntity.getName()).build();
    }
}
