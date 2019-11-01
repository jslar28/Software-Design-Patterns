package CreationalPatterns.FactoryMethod.WithAbstractCreator;

public abstract class HostileNPC extends NPC {
    @Override
    public void onSpawn() {
        System.out.println("Hostile NPC spawned");
    }

    @Override
    public void onDeath() {
        System.out.println("Hostile NPC died: +1 EXP");
    }
}
