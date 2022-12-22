package com.example.mongo.infrastructure.mongorepository;

import com.example.mongo.infrastructure.document.StudentDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface StudentMongoRepository extends MongoRepository<StudentDocument, Long> {
    List<StudentDocument> findStudentDocumentsByLastName(String lastName);

    Optional<StudentDocument> findStudentDocumentByEmail(String email);
}
