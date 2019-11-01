package CreationalPatterns.FactoryMethod.WithAbstractCreator;

public abstract class NPCFactory {
    public NPC createNPC() {
        return new Villager();
    }

    int getRandomInt(int min, int max) {
        return (int) (Math.random() * ((max-min) + 1)) + min;
    }
}
