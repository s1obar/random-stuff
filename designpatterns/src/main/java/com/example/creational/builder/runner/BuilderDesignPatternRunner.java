package com.example.creational.builder.runner;

import com.example.creational.builder.model.House;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BuilderDesignPatternRunner {
    public void runBuilderDesignPattern(){
        House houseWithPool = new House.HouseBuilder(8, 4, 4).setHasHousePool(true).setColor("orange").build();
        log.info("House with pool built. House: {}", houseWithPool.toString());

        House smartHouse = new House.HouseBuilder(8, 4, 4).setIsHouseSmart(true).setColor("white").build();
        log.info("House with pool built. House: {}", smartHouse.toString());
    }
}
