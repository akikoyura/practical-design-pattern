/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 30, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.lazy.initialization;

public final class VehicleProvider {
    private Vehicle truck;
    private Vehicle car;

    public VehicleProvider() {
    }

    Vehicle getVehicleByType(String type) {
        switch (type) {
            case "car" -> {
                if (car == null) {
                    System.out.println("Lazy Car Created");
                    car = new LazyVehicle(type);
                }
                return car;
            }
            case "truck" -> {
                if (truck == null) {
                    System.out.println("Lazy Truck Created");
                    truck = new LazyVehicle(type);
                }
                return truck;
            }
            default -> throw new IllegalArgumentException("not implemented.");
        }
    }

    public void printStatus() {
        System.out.println("status, truck: " + truck);
        System.out.println("status, car: " + car);
    }

}
