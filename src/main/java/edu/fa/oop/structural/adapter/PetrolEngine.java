/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date May 02, 2023
 * @Version 1.0
 */
package edu.fa.oop.structural.adapter;

import java.util.logging.Logger;

public final class PetrolEngine implements Engine {

    @Override
    public void run() {
        System.out.println("PetrolEngine, run");
    }

    @Override
    public void tank() {
        System.out.println("PetrolEngine, tank");
    }
}
