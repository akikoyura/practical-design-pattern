/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date May 01, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.dependencies.injection;

public interface Engine {
    void start();

    boolean isStarted();

    void run();

    String type();
}
