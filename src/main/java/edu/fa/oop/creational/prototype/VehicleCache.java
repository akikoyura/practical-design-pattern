/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 30, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.prototype;


import java.util.Map;

public final class VehicleCache {
    private static final Map<String, Vehicle> map = Map.of("fast-car", new FastCar(), "slow-car", new SlowCar());

    private VehicleCache() {
    }

    public static Vehicle getVehicle(String type) {
        Vehicle vehicle = map.get(type);
        if (vehicle == null) throw new IllegalArgumentException("not allowed: " + type);
        return vehicle.clone();
    }
}
