package com.example.creational.abstractfactory.model;

import com.example.creational.abstractfactory.Truck;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class BmwTruck implements Truck {
    private int speed;
    private int maxLoad;
    @Override
    public void load(){
        log.info("************ BMW TRUCK CREATED. LOADING. ***************");
    }
}
