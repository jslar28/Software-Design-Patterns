package CreationalPatterns.FactoryMethod.WithConcreteCreator;

public class Client {
    public static void main(String[] args) {
        NPCFactory npcFactory = new NPCFactory();
        NPC someNPC = npcFactory.createNPC();
        NPC someOtherNPC = npcFactory.createNPC();

        System.out.println(someNPC);
        System.out.println(someOtherNPC);
    }
}
