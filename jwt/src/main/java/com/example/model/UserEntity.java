package com.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "_user")
public class UserEntity {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    private String eMail;
    private String password;
}
