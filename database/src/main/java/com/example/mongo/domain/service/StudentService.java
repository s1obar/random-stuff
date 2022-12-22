package com.example.mongo.domain.service;

import com.example.mongo.domain.model.Student;
import com.example.mongo.domain.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    public List<Student> getAllByLastName(String lastName) {
        return studentRepository.getAllByLastName(lastName);
    }
}
