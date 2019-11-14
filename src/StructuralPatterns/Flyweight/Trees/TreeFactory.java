package StructuralPatterns.Flyweight.Trees;

import java.awt.*;
import java.util.HashMap;

class TreeFactory {
    private static HashMap<String, TreeType> treeTypes = new HashMap<>();

    static TreeType getTreeType(String name, Color color) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(color);
            treeTypes.put(name, result);
        }
        return result;
    }
}
