/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 30, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.singleton;

public class OnlyEngine implements Engine {
    private static OnlyEngine INSTANCE;

    private OnlyEngine() {
    }

    public static OnlyEngine getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new OnlyEngine();
        }
        return INSTANCE;
    }
}
