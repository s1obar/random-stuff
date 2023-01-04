package com.example.creational.abstractfactory.factory;

import com.example.creational.abstractfactory.Truck;
import com.example.creational.abstractfactory.Car;
import com.example.creational.abstractfactory.model.sea.Ship;
import com.example.creational.abstractfactory.model.sea.Submarine;
import lombok.Builder;

@Builder
public class BmwFactory extends VehiclesFactory {

    @Override
    public Truck createTruck(){
        return new Truck();
    }
    @Override
    public Truck createCar(){
        return new Car();
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
