package CreationalPatterns.AbstractFactory.OwnExample;

public class HostileFactory extends NPCFactory {
    @Override
    public Boss createBoss() {
        return new HostileBoss();
    }

    @Override
    public Guard createGuard() {
        return new HostileGuard();
    }
}
