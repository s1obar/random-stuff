package com.example;

import com.example.mongo.domain.enums.Gender;
import com.example.mongo.domain.model.Address;
import com.example.mongo.infrastructure.document.StudentDocument;
import com.example.mongo.infrastructure.mongorepository.StudentMongoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
@Slf4j
public class DatabaseInvestigationApplication {
    public static void main(String[] args) {
        SpringApplication.run(DatabaseInvestigationApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(StudentMongoRepository studentMongoRepository){
        return args -> {
            StudentDocument document = buildStudentDocument();
            Optional<StudentDocument> optionalDocFromDb = studentMongoRepository.findStudentDocumentByEmail(document.email());

            if(optionalDocFromDb.isPresent()){
                log.warn("*****CANNOT INSERT DOCUMENT. THERE IS ONE IN DB WITH THE SAME EMAIL FIELD(indexed).");
            }else{
                studentMongoRepository.insert(document);
            }
        };
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
