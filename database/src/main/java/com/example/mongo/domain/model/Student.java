package com.example.mongo.domain.model;

import com.example.mongo.domain.enums.Gender;
import lombok.Builder;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@Document
@Builder
public record Student(
        @Id
        String id,
        String firstName,
        String lastName,
        @Indexed(unique = true)
        String email,
        Gender gender,
        Address address,
        List<String> favoriteSubjects,
        BigDecimal totalSpentInBooks,
        LocalDateTime created)
{}
