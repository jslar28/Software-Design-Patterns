package StructuralPatterns.Composite;

abstract class Node {
    Node parent;
    int id;

    Node() {
        this.parent = null;
        id = 0;
    }

    abstract void action();

    void addChild(Node child) throws Exception {
        throw new Exception("This node cannot have children");
    }

    void removeChild(Node child) throws Exception {
        throw new Exception("This node does not have any children");
    }

    Node getChild(int i) throws Exception {
        throw new Exception("This node does not have any children");
    }
}
