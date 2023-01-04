package com.example;

import com.example.creational.abstractfactory.runner.AbstractFactoryPatternRunner;
import com.example.creational.factorymethod.runner.FactoryMethodPatternRunner;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class CustomRunner implements ApplicationRunner {
    private final FactoryMethodPatternRunner factoryMethodPatternRunner;
    private final AbstractFactoryPatternRunner abstractFactoryPatternRunner;
    @Override
    public void run(ApplicationArguments args){
        log.info("Job started");
//        factoryMethodPatternRunner.runFactoryMethodDesignPattern();
        abstractFactoryPatternRunner.runAbstractFactoryDesignPattern();
        log.info("Job ended");
        log.info("Stopping the application.");

        System.exit(0);
    }
}
