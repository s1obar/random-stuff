package com.example.creational.abstractfactory.model;

import com.example.creational.abstractfactory.Truck;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Builder
@Slf4j
@NoArgsConstructor
public class TeslaTruck implements Truck {
    @Override
    public void load(){
        log.info("************ TESLA TRUCK CREATED. LOADING. ***************");
    }
}
