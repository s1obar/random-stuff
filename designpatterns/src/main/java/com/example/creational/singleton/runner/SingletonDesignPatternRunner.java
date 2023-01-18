package com.example.creational.singleton.runner;

import com.example.creational.singleton.multithreaded.ThreadSafeSingleton;
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

    public void runThreadSafeSingletonDesignPattern(){
        Thread threadCooCoo = new Thread(new ThreadCooCoo());
        Thread threadBuuBuu = new Thread(new ThreadBuuBuu());
        threadCooCoo.start();
        threadBuuBuu.start();
    }

    static class ThreadCooCoo implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance("COO-COO");
            log.info(singleton.value);
        }
    }

    static class ThreadBuuBuu implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance("BOO-BOO");
            log.info(singleton.value);
        }
    }

}
