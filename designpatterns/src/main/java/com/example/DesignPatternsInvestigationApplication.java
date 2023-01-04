package com.example;

import com.example.creational.factorymethod.Transport;
import com.example.creational.factorymethod.factory.ShipFactory;
import com.example.creational.factorymethod.factory.TrainFactory;
import com.example.creational.factorymethod.factory.TransportFactory;
import com.example.creational.factorymethod.model.Train;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DesignPatternsInvestigationApplication {
    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication(DesignPatternsInvestigationApplication.class);
        sa.run(args);

//        TransportFactory trainFactory = TrainFactory.builder().build();
//        trainFactory.deliverPackage();
//
//        TransportFactory shipFactory = ShipFactory.builder().build();
//        shipFactory.deliverPackage();
    }
}
