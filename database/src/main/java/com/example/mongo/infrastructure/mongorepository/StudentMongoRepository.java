package com.example.mongo.infrastructure.mongorepository;

import com.example.mongo.domain.model.Student;
import com.example.mongo.infrastructure.document.StudentDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RepositoryRestResource(excerptProjection = Student.class)
public interface StudentMongoRepository extends MongoRepository<StudentDocument, Long> {
    List<Student> findStudentDocumentsByLastName(String lastName);

    Optional<Student> findStudentDocumentByEmail(String email);
}
