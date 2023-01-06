package com.example.creational.factorymethod.factory;

import com.example.creational.factorymethod.Transport;
import com.example.creational.factorymethod.model.Train;
import lombok.Builder;

@Builder
public class TrainFactory extends TransportFactory {
    @Override
    public Transport createTransport(){
        return Train.builder().maxSpeed(100).trainType("FREIGHT").build();
    }
}
