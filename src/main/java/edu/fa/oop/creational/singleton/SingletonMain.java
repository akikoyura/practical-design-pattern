/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 30, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        System.out.println("Pattern Singleton: only one engine");
        var engine = OnlyEngine.getInstance();
        var vehicle = OnlyVehicle.getInstance();

        vehicle.move();
        System.out.printf("""
                        Only Engine: '%s', equals with vehicle: '%s'
                """, engine, (vehicle.getEngine().equals(engine)));
    }
}
