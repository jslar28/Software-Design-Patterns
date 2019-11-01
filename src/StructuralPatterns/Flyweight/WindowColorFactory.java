package StructuralPatterns.Flyweight;

import java.util.HashMap;

class WindowColorFactory {
    private HashMap<String, WindowFlyweight> flyweights = new HashMap<>();

    WindowFlyweight getWindowFlyweight(String color) {
        WindowFlyweight flyweight = flyweights.get(color);
        if (flyweight == null) {
            flyweight = new WindowFlyweight(color);
            flyweights.put(color, flyweight);
        }
        return flyweight;
    }
}
