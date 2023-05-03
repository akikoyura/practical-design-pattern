/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date May 01, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.dependencies.injection;

public class EngineServiceLoader implements Engine {
    private EngineServiceLoader() {
    }

    @Override
    public void start() {
        System.out.println("EngineServiceLoader, start");
    }

    @Override
    public boolean isStarted() {
        return false;
    }

    @Override
    public void run() {

    }

    @Override
    public String type() {
        return null;
    }
}
