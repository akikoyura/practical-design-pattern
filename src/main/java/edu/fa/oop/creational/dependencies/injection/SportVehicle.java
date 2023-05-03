/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date May 01, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.dependencies.injection;

public class SportVehicle implements Vehicle {
    private final Engine engine;

    public SportVehicle(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void move() {
        if (!engine.isStarted()) engine.start();

        engine.run();
        System.out.println("SportCar, move");
    }
}
