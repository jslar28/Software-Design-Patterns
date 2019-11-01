package CreationalPatterns.FactoryMethod.WithAbstractCreator;

public class HostileNPCFactory extends NPCFactory {
    @Override
    public NPC createNPC() {
        switch (getRandomInt(2, 7)) {
            case 2:
            case 4:
            case 6:
                return new Troll();
            default:
                return new Orc();
        }
    }
}
