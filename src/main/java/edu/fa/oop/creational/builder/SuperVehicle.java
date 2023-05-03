/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date May 02, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.builder;

public record SuperVehicle(Part engine, Part cabin) implements Vehicle {

    public static final class Builder {
        private Part engine;
        private Part cabin;

        Builder() {
        }

        Builder addEngine(String type) {
            this.engine = new RecordPart(type);
            return this;
        }

        Builder addCabin(String type) {
            this.cabin = new RecordPart(type);
            return this;
        }

        Vehicle build() {
            return new SuperVehicle(this);
        }
    }

    private SuperVehicle(Builder builder) {
        this(builder.engine, builder.cabin);
    }

    @Override
    public void move() {
        System.out.println("SuperVehicle, move");
    }

    @Override
    public void parts() {
        System.out.println("SuperVehicle, engine: " + engine);
        System.out.println("SuperVehicle, cabin: " + cabin);
    }
}
