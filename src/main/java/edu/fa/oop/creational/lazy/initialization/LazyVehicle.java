/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 30, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.lazy.initialization;

public record LazyVehicle(String type) implements Vehicle {
    @Override
    public void move() {
        System.out.println("LazyVehicle, move, type:" + type);
    }
}
