package com.example.creational.singleton.singlethreaded;

public final class SingleThreadedSingleton {
    private static SingleThreadedSingleton instance;
    public String value;

    private SingleThreadedSingleton(String value){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        this.value = value;
    }

    public static SingleThreadedSingleton getInstance(String value){
        if(instance == null){
            instance = new SingleThreadedSingleton(value);
        }

        return instance;
    }
}
