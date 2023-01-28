package com.example.structural;

import com.example.structural.adapter.SocketAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Helper {
    public void getVoltages(SocketAdapter socketAdapter){
        int voltage3 = socketAdapter.get3Volts().getVolts();
        int voltage12 = socketAdapter.get12Volts().getVolts();
        int voltage120 = socketAdapter.get120Volts().getVolts();

        log.info("Lowest voltage: {}V", voltage3);
        log.info("Middle voltage: {}V", voltage12);
        log.info("Max voltage: {}V", voltage120);
    }
}
