package com.example.creational.factorymethod.factory;

import com.example.creational.factorymethod.Transport;

public abstract class TransportFactory {
    public void deliverPackage(){
        Transport transport = createTransport();
        transport.load();
    }

    public abstract Transport createTransport();
}
