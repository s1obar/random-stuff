package com.example.creational.abstractfactory.factory;

import com.example.creational.abstractfactory.Truck;
import com.example.creational.abstractfactory.Car;
import com.example.creational.abstractfactory.model.BmwCar;
import com.example.creational.factorymethod.Transport;

public abstract class VehiclesFactory {
    public abstract Truck createTruck();
    public abstract Car createCar();
}
