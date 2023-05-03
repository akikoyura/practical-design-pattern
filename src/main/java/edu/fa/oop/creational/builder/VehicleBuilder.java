/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date May 02, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.builder;

public final class VehicleBuilder {
    public static Vehicle buildSlowVehicle() {
        var engine = new RecordPart("engine");
        var cabin = new RecordPart("cabin");
        return new SlowVehicle(engine, cabin);
    }
}
