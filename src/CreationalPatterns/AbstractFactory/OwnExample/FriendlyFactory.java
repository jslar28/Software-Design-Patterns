package CreationalPatterns.AbstractFactory.OwnExample;

public class FriendlyFactory extends NPCFactory {
    @Override
    public Boss createBoss() {
        return new FriendlyBoss();
    }

    @Override
    public Guard createGuard() {
        return new FriendlyGuard();
    }
}
