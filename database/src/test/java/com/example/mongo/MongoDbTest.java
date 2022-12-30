package com.example.mongo;

import com.example.mongo.domain.enums.Gender;
import com.example.mongo.domain.model.Address;
import com.example.mongo.infrastructure.document.StudentDocument;
import com.example.mongo.infrastructure.mongorepository.StudentMongoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@DataMongoTest
public class MongoDbTest {

    @Autowired
    private StudentMongoRepository studentMongoRepository;

    @Test
    void saveStudentTest(){
        StudentDocument studentDocument = buildStudentDocument();
        StudentDocument studentSavedToTestMongoDb = studentMongoRepository.save(studentDocument);
        Assertions.assertEquals(studentDocument.address(), studentSavedToTestMongoDb.address());
    }

    private StudentDocument buildStudentDocument(){
        return StudentDocument.builder()
                .firstName("Manuela")
                .lastName("Barisic")
                .email("test.tes1@gmail.com")
                .gender(Gender.FEMALE)
                .address(Address.builder()
                        .country("Croatia")
                        .city("München")
                        .postCode("21000")
                        .build())
                .favoriteSubjects(List.of("Finances"))
                .totalSpentInBooks(BigDecimal.valueOf(15L))
                .created(LocalDateTime.now())
                .build();
    }
}
