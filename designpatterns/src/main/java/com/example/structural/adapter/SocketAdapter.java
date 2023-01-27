package com.example.structural.adapter;

import com.example.structural.adapter.model.Voltage;

public interface SocketAdapter {
    public Voltage get3Volts();
    public Voltage get12Volts();
    public Voltage get120Volts();
}
