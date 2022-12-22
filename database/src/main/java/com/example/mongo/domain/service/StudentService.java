package com.example.mongo.domain.service;

import com.example.mongo.domain.model.Student;
import com.example.mongo.infrastructure.mongorepository.StudentMongoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentMongoRepository studentMongoRepository;
    public List<Student> getAllByLastName(String lastName) {
        return studentMongoRepository.findStudentDocumentsByLastName(lastName);
    }
}
