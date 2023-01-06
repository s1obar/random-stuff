package com.example.creational.abstractfactory.factory;

import com.example.creational.abstractfactory.Car;
import com.example.creational.abstractfactory.Truck;

public abstract class VehiclesFactory {
    public abstract Truck createTruck();
    public abstract Car createCar();
}
