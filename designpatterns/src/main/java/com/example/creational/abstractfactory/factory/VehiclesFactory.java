package com.example.creational.abstractfactory.factory;

import com.example.creational.abstractfactory.Truck;
import com.example.creational.abstractfactory.Car;

public abstract class VehiclesFactory {

    public abstract Truck createTruck();
    public abstract Car createCar();
}
