/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date May 03, 2023
 * @Version 1.0
 */
package edu.fa.oop.generic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Pair<K, V> {
    private K key;
    private V value;
}

class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "Apple");
        Pair<Integer, String> pair2 = new Pair<>(2, "Pear");


    }
}