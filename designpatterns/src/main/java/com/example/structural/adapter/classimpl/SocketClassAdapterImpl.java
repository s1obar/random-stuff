package com.example.structural.adapter.classimpl;

import com.example.structural.adapter.SocketAdapter;
import com.example.structural.adapter.model.Socket;
import com.example.structural.adapter.model.Voltage;
import org.springframework.stereotype.Component;

@Component
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {
    @Override
    public Voltage get3Volts() {
        Voltage volts120 = getVoltage();
        return convertVoltage(volts120, 40);
    }

    @Override
    public Voltage get12Volts() {
        Voltage volts120 = getVoltage();
        return convertVoltage(volts120, 10);
    }

    @Override
    public Voltage get120Volts() {
        return getVoltage();
    }

    private Voltage convertVoltage(Voltage voltage, int nrOfTimesLessThenDefault){
        return new Voltage(voltage.getVolts() / nrOfTimesLessThenDefault);
    }
}
