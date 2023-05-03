/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 30, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.object.pool.pattern;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractGaragePool<T extends Vehicle> {
    private final Set<T> available = new HashSet<>();
    private final Set<T> inUse = new HashSet<>();

    protected abstract T buyVehicle();

    public synchronized T driveVehicle() {
        if (available.isEmpty()) {
            available.add(buyVehicle());
        }
        var instance = available.iterator().next();
        available.remove(instance);
        inUse.add(instance);
        return instance;
    }

    public synchronized void returnVehicle(T instance) {
        System.out.printf("returned vehicle, vin: '%s'", instance.getVin());
        System.out.println();
        inUse.remove(instance);
        available.add(instance);
    }

    public void printStatus() {
        var availableVin = available.stream().map(Vehicle::getVin).toList();
        var inUseVin = inUse.stream().map(Vehicle::getVin).toList();
        System.out.printf("Garage Pool vehicles available=%d[%s] inUse=%d[%s]%n", available.size(), availableVin, inUse.size(), inUseVin);
    }
}
