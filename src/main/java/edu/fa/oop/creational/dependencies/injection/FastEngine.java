/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date May 01, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.dependencies.injection;

public class FastEngine implements Engine {
    private final String type;
    private boolean started;

    public FastEngine(String type) {
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println("Fast Engine, started");
        started = true;
    }

    @Override
    public boolean isStarted() {
        return started;
    }

    @Override
    public void run() {
        if (started) System.out.println("FastEngine, run");
        else throw new IllegalStateException("FastEngine, not started");
    }

    @Override
    public String type() {
        return type;
    }
}
