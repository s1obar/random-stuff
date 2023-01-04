package com.example.creational.factorymethod.runner;

import com.example.creational.factorymethod.factory.ShipFactory;
import com.example.creational.factorymethod.factory.TrainFactory;
import com.example.creational.factorymethod.factory.TransportFactory;
import org.springframework.stereotype.Component;

@Component
public class FactoryMethodPatternRunner {
    public void runFactoryMethodDesignPattern(){
        TransportFactory trainFactory = TrainFactory.builder().build();
        trainFactory.deliverPackage();

        TransportFactory shipFactory = ShipFactory.builder().build();
        shipFactory.deliverPackage();
    }
}
