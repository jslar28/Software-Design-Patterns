package CreationalPatterns.FactoryMethod.WithAbstractCreator;

public class Orc extends HostileNPC {
    @Override
    public void onSpawn() {
        super.onSpawn();
        System.out.println("ME SMASH!");
    }

    @Override
    public void onDeath() {
        super.onDeath();
    }
}
