package com.example.creational.abstractfactory.runner;

import com.example.creational.abstractfactory.Car;
import com.example.creational.abstractfactory.Truck;
import com.example.creational.abstractfactory.factory.BmwFactory;
import com.example.creational.abstractfactory.factory.TeslaFactory;
import com.example.creational.abstractfactory.factory.VehiclesFactory;
import lombok.Builder;
import org.springframework.stereotype.Component;

@Component
@Builder
public class AbstractFactoryPatternRunner {
    public void runAbstractFactoryDesignPattern(){
        VehiclesFactory bmwFactory = new BmwFactory();
        VehiclesFactory teslaFactory = new TeslaFactory();

        Car bmwCar = bmwFactory.createCar();
        bmwCar.load();
        Truck bmwTruck = bmwFactory.createTruck();
        bmwTruck.load();


        Car teslaCar = teslaFactory.createCar();
        teslaCar.load();
        Truck teslaTruck = teslaFactory.createTruck();
        teslaTruck.load();
    }
}
