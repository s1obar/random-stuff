package com.example.mongo.infrastructure.document;

import com.example.mongo.domain.enums.Gender;
import com.example.mongo.domain.model.Address;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Document
@Builder
public record StudentDocument(
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
