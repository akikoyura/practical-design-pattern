/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 30, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.object.pool.pattern;

public final class PooledVehicleGarage extends AbstractGaragePool<PooledVehicle> {
    @Override
    protected PooledVehicle buyVehicle() {
        return new PooledVehicle();
    }
}
