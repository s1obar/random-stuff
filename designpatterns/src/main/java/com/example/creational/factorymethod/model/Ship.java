package com.example.creational.factorymethod.model;

import com.example.creational.factorymethod.Transport;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Builder
public class Ship implements Transport {
    private int lengthInSpeed;
    private int maxSpeed;
    public void load(){
        log.info("************ SHIP CREATED. LOADING. ***************");
    }
}
