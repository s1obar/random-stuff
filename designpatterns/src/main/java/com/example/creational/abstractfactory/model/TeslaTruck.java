package com.example.creational.abstractfactory.model;

import com.example.creational.abstractfactory.Truck;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class TeslaTruck implements Truck {
    private int speed;
    private boolean isAutonomous;
    @Override
    public void load(){
        log.info("************ TESLA TRUCK CREATED. LOADING. ***************");
    }
}
