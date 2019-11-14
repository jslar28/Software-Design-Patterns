package StructuralPatterns.Composite;

import java.util.ArrayList;

class CompositeNode extends Node {
    private ArrayList<Node> children = new ArrayList<>();

    CompositeNode() {
        super();
    }

    @Override
    void action() {
        for (Node child: children) {
            child.action();
        }
        if (parent != null) {
            System.out.println("Composite node " + id
                    + " action (parent " + parent.id + ")");
        } else {
            System.out.println("Composite node " + id
                    + " action (root node)");
        }
    }

    @Override
    void addChild(Node child) {
        child.parent = this;
        child.id = children.size() + 1;
        children.add(child);
    }

    @Override
    void removeChild(Node child) {
        child.parent = null;
        child.id = 0;
        children.remove(child);
    }

    @Override
    Node getChild(int i) {
        return children.get(i);
    }
}
