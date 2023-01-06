package com.example.creational.abstractfactory.model;

import com.example.creational.abstractfactory.Car;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class BmwCar implements Car {
    private int speed;
    private int length;
    @Override
    public void load(){
        log.info("************ BMW CAR CREATED. LOADING. ***************");
    }
}
