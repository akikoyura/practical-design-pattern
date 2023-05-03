/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date May 02, 2023
 * @Version 1.0
 */
package edu.fa.oop.structural.adapter;

public class Vehicle {
    private final Engine engine;

    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        System.out.println("Vehicle, drive");
        engine.run();
    }

    public void refuel() {
        System.out.println("Vehicle, stop");
        switch (engine) {
            case ElectricEngine electricEngine -> {
                System.out.println("Vehicle needs recharge");
                electricEngine.checkPlug();
                electricEngine.tank();
            }
            case PetrolEngine petrolEngine -> {
                System.out.println("Vehicle needs petrol");
                petrolEngine.run();
            }
            default -> throw new IllegalStateException("Vehicle has no engine");
        }
    }
}
