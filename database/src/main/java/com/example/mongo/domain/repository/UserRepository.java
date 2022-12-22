package com.example.mongo.domain.repository;

import com.example.mongo.domain.model.GroceryItem;
import com.example.mongo.infrastructure.mongorepository.MUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final MUserRepository mUserRepository;
    public GroceryItem getUserByName(String name) {
       return mUserRepository.findItemByName(name);
    }
}
