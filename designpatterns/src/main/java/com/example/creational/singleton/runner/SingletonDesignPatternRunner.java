package com.example.creational.singleton.runner;

import com.example.creational.singleton.singlethreaded.SingleThreadedSingleton;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SingletonDesignPatternRunner {
    public void runSingleThreadedSingletonDesignPattern(){
        SingleThreadedSingleton singleton = SingleThreadedSingleton.getInstance("COO-COO");
        SingleThreadedSingleton anotherSingleton = SingleThreadedSingleton.getInstance("BUU-BUU");

        if(singleton.value.equals(anotherSingleton.value)){
            log.info("Singleton was reused! All good!");
        }else{
            log.info("Two singletons were created. Not good!");
        }
    }

    public void runMultiThreadedSingletonDesignPattern(){
    }

    public void runThreadSafeSingletonDesignPattern(){
    }
}
