package com.example.creational.abstractfactory.model;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Builder
@Slf4j
@NoArgsConstructor
public class ManTruck implements com.example.creational.abstractfactory.Truck {
    @Override
    public void load(){
        log.info("************ MAN TRUCK CREATED. LOADING. ***************");
    }
}
