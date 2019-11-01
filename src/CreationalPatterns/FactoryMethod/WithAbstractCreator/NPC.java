package CreationalPatterns.FactoryMethod.WithAbstractCreator;

public abstract class NPC {
    NPC() {
        onSpawn();
    }
    public void onSpawn() {
        System.out.println("NPC Spawned");
    }
    public void onDeath() {
        System.out.println("NPC Died");
    }
}
