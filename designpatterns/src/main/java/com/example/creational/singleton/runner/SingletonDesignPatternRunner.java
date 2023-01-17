package com.example.creational.singleton.runner;

import com.example.creational.singleton.singlethreaded.SingleThreadedSingleton;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingletonDesignPatternRunner {
    public void runSingleThreadedSingletonDesignPattern(){
        SingleThreadedSingleton singleton = SingleThreadedSingleton.getInstance("COO-COO");
        SingleThreadedSingleton anotherSingleton = SingleThreadedSingleton.getInstance("BUU-BUU");

        log.info("Two same values - singleton was reused (yay!)" +
                "Two different values, 2 singletons were created (booo!!)" +
                "RESULT: " +
                "{}" +
                "{}", singleton.value, anotherSingleton.value);
    }

    public void runMultiThreadedSingletonDesignPattern(){
    }

    public void runThreadSafeSingletonDesignPattern(){
    }
}
