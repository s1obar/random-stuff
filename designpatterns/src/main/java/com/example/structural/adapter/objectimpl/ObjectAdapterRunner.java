package com.example.structural.adapter.objectimpl;

import com.example.structural.adapter.model.Voltage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class ObjectAdapterRunner {
    private final SocketObjectAdapterImpl socketObjectAdapter;

    public void runObjectAdapterDesignPatter(){
        Voltage voltage3 = socketObjectAdapter.get3Volts();
        Voltage voltage12 = socketObjectAdapter.get12Volts();
        Voltage voltage120 = socketObjectAdapter.get120Volts();


        log.info("3 volts: {}", voltage3);
        log.info("12 volts: {}", voltage12);
        log.info("120 volts: {}", voltage120);
    }
}
