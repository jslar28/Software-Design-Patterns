package CreationalPatterns.FactoryMethod.WithAbstractCreator;

public class Client {
    public static void main(String[] args) {
        NPCFactory friendlyNPCFactory = new FriendlyNPCFactory();
        NPCFactory hostileNPCFactory = new HostileNPCFactory();

        for (int i = 0; i < 3; i++) {
            NPC friendlyNPC = friendlyNPCFactory.createNPC();
            NPC hostileNPC = hostileNPCFactory.createNPC();

            friendlyNPC.onDeath();
            hostileNPC.onDeath();
        }
    }
}
