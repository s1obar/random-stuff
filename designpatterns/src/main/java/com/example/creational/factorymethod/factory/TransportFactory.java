package com.example.creational.factorymethod.factory;

import com.example.creational.factorymethod.Transport;

public abstract class TransportFactory {
    public Transport deliverPackage(){
        Transport transport = createTransport();
        transport.load();
        return transport;
    }

    public abstract Transport createTransport();
}
