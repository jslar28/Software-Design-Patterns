package StructuralPatterns.Flyweight.Trees;

import java.awt.*;

public class Client {
    public static void main(String[] args) {
        int CANVAS_SIZE = 500;
        int TREES_TO_DRAW = 1000000;
        int TREE_TYPES = 2;
        int iterations = (int) Math.floor((float) TREES_TO_DRAW / TREE_TYPES);

        Forest forest = new Forest();
        for (int i = 0; i < iterations; i++) {
            forest.plantTree(random(CANVAS_SIZE), random(CANVAS_SIZE),
                    "Summer Oak", Color.GREEN);
            forest.plantTree(random(CANVAS_SIZE), random(CANVAS_SIZE),
                    "Autumn Oak", Color.ORANGE);
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);
    }

    private static int random(int max) {
        return (int) (Math.random() * (max + 1));
    }
}
