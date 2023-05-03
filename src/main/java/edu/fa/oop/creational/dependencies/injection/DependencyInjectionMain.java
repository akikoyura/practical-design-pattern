/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date May 02, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.dependencies.injection;

public final class DependencyInjectionMain {
    public static void main(String[] args) {
        System.out.println("Pattern Dependency Injection: vehicle and engine");
        EngineServiceProvider.addEngine(new FastEngine("sport"));

        Engine engine = EngineServiceProvider.getEngineByType("sport");
        Vehicle vehicle = new SportVehicle(engine);
        vehicle.move();

    }
}
