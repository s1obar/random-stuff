package com.example.creational.abstractfactory.model;

import com.example.creational.abstractfactory.Car;
import com.example.creational.abstractfactory.Truck;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Builder
@Slf4j
@NoArgsConstructor
public class BmwCar implements Car {
    @Override
    public void load(){
        log.info("************ BMW CAR CREATED. LOADING. ***************");
    }
}
