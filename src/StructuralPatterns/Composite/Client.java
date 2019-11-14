package StructuralPatterns.Composite;

public class Client {
    public static void main(String[] args) {
        Node root = new CompositeNode();
        Node leaf = new LeafNode();
        try {
            root.addChild(new CompositeNode());
            root.addChild(leaf);

            root.getChild(0).addChild(new LeafNode());
            root.getChild(0).addChild(new LeafNode());

            Node child = root.getChild(0).getChild(1);
            root.getChild(0).removeChild(child);

            root.getChild(1).addChild(new LeafNode());
        } catch (Exception e) {
            e.printStackTrace();
        }

        root.action();
    }
}
