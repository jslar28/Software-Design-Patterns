package CreationalPatterns.FactoryMethod.WithAbstractCreator;

public abstract class FriendlyNPC extends NPC {
    @Override
    public void onSpawn() {
        System.out.println("Friendly NPC spawned");
    }

    @Override
    public void onDeath() {
        System.out.println("Friendly NPC died: -1 REP");
    }
}
