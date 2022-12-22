package com.example.mongo.domain.repository;

import com.example.mongo.domain.model.Student;
import com.example.mongo.infrastructure.document.StudentDocument;
import com.example.mongo.infrastructure.mongorepository.StudentMongoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class StudentRepository {

    private final StudentMongoRepository studentMongoRepository;
    public List<Student> getAllByLastName(String lastName) {
        List<StudentDocument> studentDocuments = studentMongoRepository.findStudentDocumentsByLastName(lastName);

        return mapFromDocuments(studentDocuments);
    }

    private List<Student> mapFromDocuments(List<StudentDocument> studentDocuments) {
        List<Student> students = new ArrayList<>();
        studentDocuments.forEach(studentDocument -> {
            Student student = Student.builder()
                    .firstName(studentDocument.firstName())
                    .lastName(studentDocument.lastName())
                    .gender(studentDocument.gender())
                    .email(studentDocument.email())
                    .address(studentDocument.address())
                    .favoriteSubjects(studentDocument.favoriteSubjects())
                    .totalSpentInBooks(studentDocument.totalSpentInBooks())
                    .created(studentDocument.created())
                    .build();

            students.add(student);
        });

        return students;
    }
}
