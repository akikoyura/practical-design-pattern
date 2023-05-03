/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 30, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.singleton;


// lazy initialization
public class OnlyVehicle {
    private static final OnlyVehicle INSTANCE = new OnlyVehicle();

    public static OnlyVehicle getInstance() {
        return INSTANCE;
    }

    private final Engine engine;

    private OnlyVehicle() {
        this.engine = OnlyEngine.getInstance();
//        this.engine = OnlyEngineEnum.INSTANCE;
    }

    public void move() {
        System.out.println("OnlyVehicle, moves");
    }

    public Engine getEngine() {
        return engine;
    }
}
