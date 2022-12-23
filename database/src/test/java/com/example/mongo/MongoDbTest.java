package com.example.mongo;

import com.example.mongo.infrastructure.mongorepository.StudentMongoRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

import java.io.IOException;
import java.net.Socket;

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

    private void assertThatPortIsAvailable(){
        try{
            new Socket(mongoDBContainer.getHost(), mongoDBContainer.getFirstMappedPort());
        }catch(IOException e){
            throw new AssertionError("The expected port " + mongoDBContainer.getFirstMappedPort() + " is not available.");
        }
    }
}
