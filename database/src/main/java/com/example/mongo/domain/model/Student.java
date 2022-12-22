package com.example.mongo.domain.model;

import java.time.LocalDateTime;
import java.util.List;

public interface Student{
    String getFirstName();
    String getLastName();
    String getEmail();
    String getGender();
    Address getAddress();
    List<String> getFavoriteSubjects();
     String getTotalSpentInBooks();
    LocalDateTime getCreated();
}


