package CreationalPatterns.FactoryMethod.StaticCreatorMethod;

public class OrcNPCFactory extends NPCFactory {
    public static NPC createNPC(String type) {
        System.out.println("helo");
        return new Orc();
    }
}
