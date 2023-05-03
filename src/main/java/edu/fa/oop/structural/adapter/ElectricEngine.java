/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date May 02, 2023
 * @Version 1.0
 */
package edu.fa.oop.structural.adapter;

public final class ElectricEngine implements Engine {

    @Override
    public void run() {
        System.out.println("ElectricEngine, run");
    }

    @Override
    public void tank() {
        System.out.println("ElectricEngine, recharging");
    }

    public void checkPlug() {
        System.out.println("ElectricEngine, check plug");
    }
}
