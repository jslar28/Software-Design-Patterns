package StructuralPatterns.Flyweight;

class WindowFlyweight {
    String getColor() {
        return color;
    }

    private String color;

    WindowFlyweight(String color) {
        System.out.println("Called flyweight constructor.");
        this.color = color;
    }
}
