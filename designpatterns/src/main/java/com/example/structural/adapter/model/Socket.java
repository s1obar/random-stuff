package com.example.structural.adapter.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Socket {
    public Voltage getVoltage(){
        return new Voltage(120);
    }
}
