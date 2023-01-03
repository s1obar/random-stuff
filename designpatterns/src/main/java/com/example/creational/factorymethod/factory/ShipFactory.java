package com.example.creational.factorymethod.factory;

import com.example.creational.factorymethod.Transport;
import com.example.creational.factorymethod.model.Ship;
import lombok.Builder;

@Builder
public class ShipFactory extends TransportFactory {
    @Override
    public Transport createTransport(){
        return Ship.builder().build();
    }
}
