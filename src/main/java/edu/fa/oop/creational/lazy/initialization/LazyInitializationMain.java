/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 30, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.lazy.initialization;

public class LazyInitializationMain {
    public static void main(String[] args) {
        System.out.println("Pattern Lazy initialization: Lazy vehicles");

        var vehicleProvider = new VehicleProvider();
        var truck1 = vehicleProvider.getVehicleByType("truck");
        vehicleProvider.printStatus();
        truck1.move();

        var car1 = vehicleProvider.getVehicleByType("car");
        var car2 = vehicleProvider.getVehicleByType("car");
        vehicleProvider.printStatus();
        car1.move();
        car2.move();
        System.out.println("car1 == car2: " + (car1.equals(car2)));
    }
}
