/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 20, 2023
 * @Version 1.0
 */
package edu.fa.oop.interf.segregation.principle.improve;

public class Main {
    private static void printIsMoving(Vehicle vehicle) {
        // No access to internal state
    }

    private static void printIsMoving(Car c) {
        System.out.println(c.engineOn());
    }

    private static void printIsMoving(Bike b) {
        System.out.println(b.pedalsMove());
    }

    public static void main(String[] args) {

    }
}
