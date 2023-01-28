package com.example.structural.adapter.objectimpl;

import com.example.structural.Helper;
import com.example.structural.adapter.SocketAdapter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Slf4j
@Component
public class ObjectAdapterRunner {
    private final Helper helper;
    public void runObjectAdapterDesignPatter(){
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        helper.getVoltages(socketAdapter);
    }
}
