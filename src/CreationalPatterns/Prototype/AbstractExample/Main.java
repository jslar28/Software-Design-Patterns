package CreationalPatterns.Prototype.AbstractExample;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(PrototypeCache.getPrototype("center"));

        client.someClientCode();
        client.abstractPrototype = PrototypeCache.getPrototype("top left");
        client.someClientCode();
        client.abstractPrototype = PrototypeCache.getPrototype("top left 3D");
        client.someClientCode();
        client.abstractPrototype = PrototypeCache.getPrototype("center");
        client.someClientCode();
    }
}
