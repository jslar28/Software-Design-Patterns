package StructuralPatterns.Flyweight.Trees;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Forest extends JFrame {
    private ArrayList<Tree> trees = new ArrayList<>();

    void plantTree(int x, int y, String name, Color color) {
        TreeType type = TreeFactory.getTreeType(name, color);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}