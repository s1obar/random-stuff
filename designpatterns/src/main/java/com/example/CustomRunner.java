package com.example;

import com.example.creational.factorymethod.runner.FactoryMethodPatterRunner;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class CustomRunner implements ApplicationRunner {
    private final FactoryMethodPatterRunner factoryMethodPatterRunner;
    @Override
    public void run(ApplicationArguments args){
        log.info("Job started");
        factoryMethodPatterRunner.runFactoryMethodDesignPattern();
        log.info("Job ended");
        log.info("Stopping the application.");

        System.exit(0);
    }
}
