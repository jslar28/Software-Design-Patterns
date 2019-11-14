package StructuralPatterns.Flyweight.Trees;

import java.awt.*;

class TreeType {
    private Color color;

    TreeType(Color color) {
        this.color = color;
    }

    void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}
