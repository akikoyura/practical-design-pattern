/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 20, 2023
 * @Version 1.0
 */
package edu.fa.oop.interf.segregation.principle;

public class Car implements Vehicle{

    @Override
    public void setMove(boolean moving) {

    }

    @Override
    public boolean engineOn() {
        return true;
    }

    @Override
    public boolean pedalMove() {
        throw new IllegalStateException("Not Supported");
    }
}
