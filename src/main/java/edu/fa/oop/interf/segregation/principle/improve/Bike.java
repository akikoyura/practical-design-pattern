/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 20, 2023
 * @Version 1.0
 */
package edu.fa.oop.interf.segregation.principle.improve;

public class Bike implements Vehicle, HasPedals{

    @Override
    public boolean pedalsMove() {
        return true;
    }

    @Override
    public void setMove(boolean moving) {

    }
}