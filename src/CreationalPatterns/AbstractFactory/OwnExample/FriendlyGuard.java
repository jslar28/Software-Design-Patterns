package CreationalPatterns.AbstractFactory.OwnExample;

public class FriendlyGuard extends Guard {
    @Override
    public void spawn() {
        System.out.println("Spawned friendly guard");
    }
}
