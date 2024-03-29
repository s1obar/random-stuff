package com.example;

import com.example.creational.abstractfactory.runner.AbstractFactoryPatternRunner;
import com.example.creational.builder.runner.BuilderDesignPatternRunner;
import com.example.creational.factorymethod.runner.FactoryMethodPatternRunner;
import com.example.creational.prototype.runner.PrototypeDesignPatternRunner;
import com.example.creational.singleton.runner.SingletonDesignPatternRunner;
import com.example.structural.adapter.classimpl.ClassAdapterRunner;
import com.example.structural.adapter.objectimpl.ObjectAdapterRunner;
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
    private final BuilderDesignPatternRunner builderDesignPatternRunner;
    private final PrototypeDesignPatternRunner prototypeDesignPatternRunner;
    private final SingletonDesignPatternRunner singletonDesignPatternRunner;
    private final ObjectAdapterRunner objectAdapterRunner;
    private final ClassAdapterRunner classAdapterRunner;
    @Override
    public void run(ApplicationArguments args){
        log.info("Job started");
//        factoryMethodPatternRunner.runFactoryMethodDesignPattern();
//        abstractFactoryPatternRunner.runAbstractFactoryDesignPattern();
//        builderDesignPatternRunner.runBuilderDesignPattern();
//        prototypeDesignPatternRunner.runPrototypeDesignPattern();
//        singletonDesignPatternRunner.runSingleThreadedSingletonDesignPattern();
//        singletonDesignPatternRunner.runThreadSafeSingletonDesignPattern();
        classAdapterRunner.runClassAdapterDesignPatter();
        log.info("Job ended");
        log.info("Stopping the application.");

        System.exit(0);
    }
}
