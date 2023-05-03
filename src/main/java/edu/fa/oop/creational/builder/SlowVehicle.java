/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date May 02, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.builder;

public class SlowVehicle implements Vehicle {
    private final Part engine;
    private final Part cabin;

    SlowVehicle(Part engine, Part cabin) {
        this.engine = engine;
        this.cabin = cabin;
    }

    @Override
    public void move() {
        System.out.println("Slow Vehicle, move");
    }

    @Override
    public void parts() {
        System.out.println("SlowVehicle, engine: " + engine);
        System.out.println("SlowVehicle, cabin: " + cabin);
    }
}
