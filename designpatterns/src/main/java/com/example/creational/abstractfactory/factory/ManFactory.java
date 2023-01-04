package com.example.creational.abstractfactory.factory;

import com.example.creational.abstractfactory.Truck;
import com.example.creational.abstractfactory.Car;
import com.example.creational.abstractfactory.model.BmwCar;
import com.example.creational.abstractfactory.model.ManTruck;
import com.example.creational.abstractfactory.model.sea.Ship;
import com.example.creational.abstractfactory.model.sea.Submarine;
import lombok.Builder;

@Builder
public class ManFactory extends VehiclesFactory {

    @Override
    public Truck createTruck(){
        return new ManTruck();
    }
    @Override
    public Truck createTrain(){
        return new BmwCar();
    }

    @Override
    public Car createSubmarine(){
        return new Submarine();
    }

    @Override
    public Car createShip(){
        return new Ship();
    }
}
