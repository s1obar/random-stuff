package com.example.jwt.infrastructure.jpa.repository;

import com.example.jwt.infrastructure.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmail(String eMail);
}
