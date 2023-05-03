/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date May 03, 2023
 * @Version 1.0
 */
package edu.fa.oop.generic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Box<T> {
    private T t;

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setT(10);
        integerBox.inspect(Integer.valueOf(10));
    }
}
