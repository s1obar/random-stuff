package com.example.mongo;

import com.example.mongo.domain.enums.Gender;
import com.example.mongo.domain.model.Address;
import com.example.mongo.domain.model.Student;
import com.example.mongo.infrastructure.document.StudentDocument;
import com.example.mongo.infrastructure.mongorepository.StudentMongoRepository;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.List;

@Testcontainers
@SpringBootTest
public class MongoDbTest {
    @Autowired
    private StudentMongoRepository studentMongoRepository;

    @Container
    public static MongoDBContainer mongoDBContainer = new MongoDBContainer(DockerImageName.parse("mongo:6.0.3"));

    @BeforeAll
    static void init(){
        mongoDBContainer.start();
    }

    @Test
    void containerStartsAndPublicPortIsAvailable(){
        assertThatPortIsAvailable();
    }

    @Test
    void saveStudentTest(){
        studentMongoRepository.deleteAll();

        StudentDocument studentDocument = buildStudentDocument();
        StudentDocument studentSavedToTestMongoDb = studentMongoRepository.save(studentDocument);
        Assertions.assertEquals(studentDocument.address(), studentSavedToTestMongoDb.address());
    }

    private void assertThatPortIsAvailable(){
        try{
            new Socket(mongoDBContainer.getHost(), mongoDBContainer.getFirstMappedPort());
        }catch(IOException e){
            throw new AssertionError("The expected port " + mongoDBContainer.getFirstMappedPort() + " is not available.");
        }
    }

    @AfterAll
    static void stopContainer(){
        mongoDBContainer.close();
    }

    private StudentDocument buildStudentDocument(){
        return StudentDocument.builder()
                .firstName("Manuela")
                .lastName("Barisic")
                .email("test.tes1@gmail.com")
                .gender(Gender.FEMALE)
                .address(Address.builder()
                        .country("Germany")
                        .city("Split")
                        .postCode("21000")
                        .build())
                .favoriteSubjects(List.of("Finances"))
                .totalSpentInBooks(BigDecimal.valueOf(15L))
                .created(LocalDateTime.now())
                .build();
    }
}
