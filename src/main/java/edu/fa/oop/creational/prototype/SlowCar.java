/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 30, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.prototype;

public class SlowCar extends Vehicle {
    public SlowCar() {
        super("slow car");
    }

    @Override
    public void move() {
        System.out.printf("""
                %s, move
                """, type);
    }
}
