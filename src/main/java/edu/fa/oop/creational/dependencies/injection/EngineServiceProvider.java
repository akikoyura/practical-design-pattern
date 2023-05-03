/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date May 01, 2023
 * @Version 1.0
 */
package edu.fa.oop.creational.dependencies.injection;

import java.util.HashMap;
import java.util.Map;

public final class EngineServiceProvider {
    private static final Map<String, Engine> ENGINES = new HashMap<>();

    private EngineServiceProvider() {
    }

    public static void addEngine(Engine engine) {
        ENGINES.put(engine.type(), engine);
    }

    public static Engine getEngineByType(String type) {
        return ENGINES.values().stream().filter(element -> element.type().equals(type))
                .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
