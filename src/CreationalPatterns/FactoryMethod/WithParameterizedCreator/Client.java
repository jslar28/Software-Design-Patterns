package CreationalPatterns.FactoryMethod.WithParameterizedCreator;

public class Client {
    public static void main(String[] args) {
        NPCFactory factory = new NPCFactory();
        NPC product = factory.createNPC("Orc");
    }
}
