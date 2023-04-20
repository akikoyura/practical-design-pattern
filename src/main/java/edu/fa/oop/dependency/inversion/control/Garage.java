/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 20, 2023
 * @Version 1.0
 */
package edu.fa.oop.dependency.inversion.control;

import lombok.Setter;

import java.util.List;

@Setter
public class Garage {
    private List<Vehicle> parkingSpots;

    public void park(Vehicle vehicle) {
        parkingSpots.add(vehicle);
    }
}
