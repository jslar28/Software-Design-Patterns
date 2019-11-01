package StructuralPatterns.Flyweight;

import java.text.DecimalFormat;

class Window {
    private double height;
    private double width;
    private WindowFlyweight flyweight;

    Window(double height, double width, WindowFlyweight flyweight) {
        this.height = height;
        this.width = width;
        //windowColor = new StructuralPatterns.Flyweight.WindowColor(color);     // without flyweight
        this.flyweight = flyweight;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##");
        return (df.format(height) + "x" + df.format(width) + " " + flyweight.getColor());
    }
}
