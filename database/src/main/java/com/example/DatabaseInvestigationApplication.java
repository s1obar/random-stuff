package com.example;

import com.example.mongo.domain.enums.Gender;
import com.example.mongo.domain.model.Address;
import com.example.mongo.domain.model.Student;
import com.example.mongo.infrastructure.mongorepository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class DatabaseInvestigationApplication {
    public static void main(String[] args) {
        SpringApplication.run(DatabaseInvestigationApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(StudentRepository studentRepository){
        return args -> {
            Student student = Student.builder()
                    .firstName("Manuela")
                    .lastName("Barisic")
                    .email("test.test@gmail.com")
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

            studentRepository.insert(student);
        };
    }
}
