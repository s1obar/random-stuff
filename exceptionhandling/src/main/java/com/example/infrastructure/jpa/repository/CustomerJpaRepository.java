package com.example.infrastructure.jpa.repository;

import com.example.infrastructure.jpa.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerJpaRepository extends JpaRepository<CustomerEntity, Long> {
}
