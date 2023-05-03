/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date May 03, 2023
 * @Version 1.0
 */
package edu.fa.oop.structural.bridge;

public sealed interface Engine permits PetrolEngine, DieselEngine {
    void turnOn();

    void turnOff();
}
