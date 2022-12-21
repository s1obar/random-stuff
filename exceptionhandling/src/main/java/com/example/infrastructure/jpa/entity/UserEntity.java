package com.example.infrastructure.jpa.entity;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "USER")
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
}
