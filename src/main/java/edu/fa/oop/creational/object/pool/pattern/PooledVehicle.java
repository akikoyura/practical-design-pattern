/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 30, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.object.pool.pattern;

import java.util.concurrent.atomic.AtomicInteger;

public class PooledVehicle implements Vehicle {

    private static final AtomicInteger COUNTER = new AtomicInteger();

    private final int vin;

    public PooledVehicle() {
        this.vin = COUNTER.incrementAndGet();
    }

    @Override
    public int getVin() {
        return vin;
    }

    @Override
    public void move() {
        System.out.println("PooledVehicle, move, vin='%s'".formatted( vin));
    }
}
