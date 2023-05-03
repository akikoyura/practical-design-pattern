/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date May 02, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.builder;

public class StandardPart implements Part {
    private final String name;

    public StandardPart(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return null;
    }
}
