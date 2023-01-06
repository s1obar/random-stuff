package com.example.creational.abstractfactory.factory;

import com.example.creational.abstractfactory.Car;
import com.example.creational.abstractfactory.Truck;
import com.example.creational.abstractfactory.model.BmwCar;
import com.example.creational.abstractfactory.model.BmwTruck;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
public class BmwFactory extends VehiclesFactory {

    @Override
    public Truck createTruck(){
        return new BmwTruck(100, 10000);
    }
    @Override
    public Car createCar(){return new BmwCar(200, 1000);
    }
}
