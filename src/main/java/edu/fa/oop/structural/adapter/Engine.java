/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date May 02, 2023
 * @Version 1.0
 */
package edu.fa.oop.structural.adapter;

public sealed interface Engine permits ElectricEngine, PetrolEngine {
    void run();
    void tank();
}
