/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date May 02, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.dependencies.injection;

import java.util.ServiceLoader;

public class DependencyInjectionServiceLoaderMain {
    public static void main(String[] args) {
        System.out.println("Pattern Dependency Injection Service Loader: vehicle and engine");
        ServiceLoader<Engine> engineService = ServiceLoader.load(Engine.class);
        Engine engine = engineService.findFirst().orElseThrow();
        Vehicle vehicle = new SportVehicle(engine);
        vehicle.move();
    }
}
