/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date May 02, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.builder;

public class FastVehicle implements Vehicle {

    public static final class Builder {
        private Part engine;
        private Part cabin;

        Builder() {
        }

        Builder addEngine(String engine) {
            this.engine = new RecordPart(engine);
            return this;
        }

        Builder addCabin(String cabin) {
            this.cabin = new RecordPart(cabin);
            return this;
        }

        FastVehicle build() {
            return new FastVehicle(engine, cabin);
        }
    }

    private final Part engine;
    private final Part cabin;

    public FastVehicle(Part engine, Part cabin) {
        this.engine = engine;
        this.cabin = cabin;
    }

    @Override
    public void move() {
        System.out.println("FastVehicle, move");

    }

    @Override
    public void parts() {
        System.out.println("FastVehicle, engine: " + engine);
        System.out.println("FastVehicle, cabin: " + cabin);
    }

}
