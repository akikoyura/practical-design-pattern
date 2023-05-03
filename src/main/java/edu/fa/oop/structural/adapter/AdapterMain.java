/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date May 02, 2023
 * @Version 1.0
 */
package edu.fa.oop.structural.adapter;

public final class AdapterMain {
    public static void main(String[] args) {

        System.out.println("Adapter Pattern: Engines");

        var electricEngine = new ElectricEngine();
        var enginePetrol = new PetrolEngine();
        var vehicleElectric = new Vehicle(electricEngine);
        var vehiclePetrol = new Vehicle(enginePetrol);

        vehicleElectric.drive();
        vehicleElectric.refuel();

        vehiclePetrol.drive();
        vehiclePetrol.refuel();
    }
}
