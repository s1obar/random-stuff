package com.example.mongo.domain.service;

import com.example.mongo.domain.model.Student;
import com.example.mongo.infrastructure.mongorepository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    public Student getStudentByLastName(String lastName) {
        return studentRepository.findStudentByLastName(lastName);
    }
}
