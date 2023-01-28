package com.example.structural.adapter.objectimpl;

import com.example.structural.adapter.SocketAdapter;
import com.example.structural.adapter.model.Voltage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Slf4j
@Component
public class ObjectAdapterRunner {
    public void runObjectAdapterDesignPatter(){
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        int voltage3 = socketAdapter.get3Volts().getVolts();
        int voltage12 = socketAdapter.get12Volts().getVolts();
        int voltage120 = socketAdapter.get120Volts().getVolts();


        log.info("Lowest voltage: {}V", voltage3);
        log.info("Middle voltage: {}V", voltage12);
        log.info("Max voltage: {}V", voltage120);
    }
}
