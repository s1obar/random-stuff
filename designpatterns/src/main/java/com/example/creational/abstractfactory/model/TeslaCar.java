package com.example.creational.abstractfactory.model;

import com.example.creational.abstractfactory.Car;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class TeslaCar implements Car {
    private int speed;
    private boolean isAutonomous;

    @Override
    public void load(){
        log.info("************ TESLA CAR CREATED. LOADING. ***************");
    }
}
