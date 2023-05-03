/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 29, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.abstr.factory;

public record SportCar(String type) implements Vehicle{
    @Override
    public void move() {
        System.out.printf("""
                Sport Car, type: '%s', move
                %n""", type);
    }
}
