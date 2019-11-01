package CreationalPatterns.FactoryMethod.WithAbstractCreator;

public class Villager extends FriendlyNPC {
    @Override
    public void onSpawn() {
        super.onSpawn();
        System.out.println("Help me!");
    }

    @Override
    public void onDeath() {
        System.out.println("Nooo!");
        super.onDeath();
    }
}
