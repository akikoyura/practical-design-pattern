/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 30, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        System.out.println("Pattern Prototype: Vehicle Prototype 1");
        Vehicle fastCar1 = VehicleCache.getVehicle("fast-car");
        Vehicle fastCar2 = VehicleCache.getVehicle("fast-car");

        fastCar1.move();
        fastCar2.move();

        System.out.println("equals: " + (fastCar1.equals(fastCar2)));
        System.out.println("fastCar1: " + fastCar1);
        System.out.println("fastCar2: " + fastCar2);
    }
}
