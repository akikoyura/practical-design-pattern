/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 29, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.abstr.factory;

public class HeavyTruck implements Vehicle {
    @Override
    public void move() {
        System.out.println("Heavy Truck, Move");
    }
}
