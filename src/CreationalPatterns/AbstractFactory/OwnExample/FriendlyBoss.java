package CreationalPatterns.AbstractFactory.OwnExample;

public class FriendlyBoss extends Boss {
    @Override
    public void activate() {
        System.out.println("Welcome mortals!");
    }
}
