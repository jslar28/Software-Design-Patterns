package CreationalPatterns.FactoryMethod.WithAbstractCreator;

public class Troll extends HostileNPC {
    @Override
    public void onSpawn() {
        super.onSpawn();
    }

    @Override
    public void onDeath() {
        System.out.println("OW");
        super.onDeath();
    }
}
