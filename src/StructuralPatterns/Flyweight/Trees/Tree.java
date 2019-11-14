package StructuralPatterns.Flyweight.Trees;

import java.awt.*;

class Tree {
    private int x;
    private int y;
    private TreeType type;

    Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
