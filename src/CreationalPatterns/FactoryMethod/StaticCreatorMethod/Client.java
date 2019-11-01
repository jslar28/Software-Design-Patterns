package CreationalPatterns.FactoryMethod.StaticCreatorMethod;

// This is not the Factory Method Pattern!

public class Client {
    public static void main(String[] args) {
        NPC product = NPCFactory.createNPC("Orc");
        System.out.println(product);
    }
}
