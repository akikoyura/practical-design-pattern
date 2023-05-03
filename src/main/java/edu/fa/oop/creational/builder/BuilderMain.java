/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date May 02, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        System.out.println("Pattern Builder: building vehicles");

        var slowVehicle = VehicleBuilder.buildSlowVehicle();
        var fastVehicle = new FastVehicle.Builder()
                .addCabin("cabin")
                .addEngine("Engine")
                .build();

        var superVehicle = new SuperVehicle.Builder()
                .addCabin("super_cabin")
                .addEngine("super_engine")
                .build();

        slowVehicle.parts();
        fastVehicle.parts();

        System.out.println(superVehicle);
        superVehicle.parts();
    }
}
