package com.example.creational.abstractfactory.factory;

import com.example.creational.abstractfactory.Car;
import com.example.creational.abstractfactory.Truck;
import com.example.creational.abstractfactory.model.TeslaCar;
import com.example.creational.abstractfactory.model.TeslaTruck;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
public class TeslaFactory extends VehiclesFactory {

    @Override
    public Truck createTruck(){
        return new TeslaTruck(100, true);
    }
    @Override
    public Car createCar(){
        return new TeslaCar(200, false);
    }
}
