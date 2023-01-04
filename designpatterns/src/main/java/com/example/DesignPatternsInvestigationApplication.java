package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsInvestigationApplication {
    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication(DesignPatternsInvestigationApplication.class);
        sa.run(args);
    }
}
