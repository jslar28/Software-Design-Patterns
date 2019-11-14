package StructuralPatterns.Composite;

class LeafNode extends Node {
    LeafNode() {
        super();
    }

    @Override
    void action() {
        System.out.println("Leaf node " + id + " action (parent " +
                parent.id + ")");
    }
}
