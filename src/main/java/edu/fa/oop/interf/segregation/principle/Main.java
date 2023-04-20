/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 20, 2023
 * @Version 1.0
 */
package edu.fa.oop.interf.segregation.principle;

public class Main {
    private static void printIsMoving(Vehicle vehicle) {
        if (vehicle instanceof Car car) {
            System.out.println(car.engineOn());
        }
        if (vehicle instanceof Bike bike) {
            System.out.println(bike.pedalMove());
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        printIsMoving(car);
        Bike bike = new Bike();
        printIsMoving(bike);
    }
}
