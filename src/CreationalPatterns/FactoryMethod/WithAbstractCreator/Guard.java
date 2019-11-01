package CreationalPatterns.FactoryMethod.WithAbstractCreator;

public class Guard extends FriendlyNPC {
    @Override
    public void onSpawn() {
        super.onSpawn();
        System.out.println("Get behind me!");
    }

    @Override
    public void onDeath() {
        System.out.println("Fall back!");
        super.onDeath();
    }
}
