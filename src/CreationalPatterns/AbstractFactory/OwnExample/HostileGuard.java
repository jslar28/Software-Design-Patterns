package CreationalPatterns.AbstractFactory.OwnExample;

public class HostileGuard extends Guard {
    @Override
    public void spawn() {
        System.out.println("Spawned hostile guard");
    }
}
