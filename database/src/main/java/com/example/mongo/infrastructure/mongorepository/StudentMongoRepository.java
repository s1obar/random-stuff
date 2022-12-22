package com.example.mongo.infrastructure.mongorepository;

import com.example.mongo.infrastructure.document.StudentDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StudentMongoRepository extends MongoRepository<StudentDocument, Long> {
    List<StudentDocument> findStudentDocumentsByLastName(String lastName);
}
