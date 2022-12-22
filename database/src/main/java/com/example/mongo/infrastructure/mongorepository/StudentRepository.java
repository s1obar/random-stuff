package com.example.mongo.infrastructure.mongorepository;

import com.example.mongo.domain.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface StudentRepository extends MongoRepository<Student, Long> {
    @Query("{lastName: '?0'}")
    Student findStudentByLastName(String lastName);

    @Query(value = "{category: '?0'}", fields = "{'name': 1, 'quantity': 1}")
    List<Student> findAll(String category);
}
