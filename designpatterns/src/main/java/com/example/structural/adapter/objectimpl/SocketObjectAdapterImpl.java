package com.example.structural.adapter.objectimpl;

import com.example.structural.adapter.SocketAdapter;
import com.example.structural.adapter.model.Voltage;

public class SocketObjectAdapterImpl implements SocketAdapter {
    @Override
    public Voltage get3Volts() {
        return null;
    }

    @Override
    public Voltage get12Volts() {
        return null;
    }

    @Override
    public Voltage get120Volts() {
        return null;
    }
}
