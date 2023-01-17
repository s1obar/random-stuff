package com.example.creational.factorymethod.model;

import com.example.creational.factorymethod.Transport;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Builder
public class Train implements Transport {
    private String trainType;
    private int maxSpeed;

    @Override
    public void load(){
        log.info("************ TRAIN CREATED. LOADING. ***************");
    }
}
