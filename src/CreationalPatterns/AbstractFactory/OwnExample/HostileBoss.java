package CreationalPatterns.AbstractFactory.OwnExample;

public class HostileBoss extends Boss {
    @Override
    public void activate() {
        System.out.println("Too soon!");
    }
}
