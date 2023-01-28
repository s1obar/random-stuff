package com.example.structural.adapter.classimpl;

import com.example.structural.Helper;
import com.example.structural.adapter.SocketAdapter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Slf4j
@Component
public class ClassAdapterRunner {
    private final Helper helper;
    public void runClassAdapterDesignPatter(){
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        helper.getVoltages(socketAdapter);
    }
}
