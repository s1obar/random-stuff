package com.example.creational.abstractfactory.model;

import com.example.creational.abstractfactory.Car;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Builder
@Slf4j
@NoArgsConstructor
public class ManCar implements Car {
    @Override
    public void load(){
        log.info("************ MAN CAR CREATED. LOADING. ***************");
    }
}
