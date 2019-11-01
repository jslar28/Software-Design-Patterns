package CreationalPatterns.FactoryMethod.WithAbstractCreator;

public class FriendlyNPCFactory extends NPCFactory {
    @Override
    public NPC createNPC() {
        NPC npc = super.createNPC();
        switch (getRandomInt(1, 6)) {
            case 1:
            case 3:
            case 5:
                npc = new Guard();
                break;
        }
        return npc;
    }
}
