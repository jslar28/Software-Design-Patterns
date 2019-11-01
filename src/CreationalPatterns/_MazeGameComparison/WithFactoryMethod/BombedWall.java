package CreationalPatterns._MazeGameComparison.WithFactoryMethod;

public class BombedWall extends Wall {
    @Override
    void onEnter() {
        System.out.println("Ran into bombed wall");
    }

    @Override
    public String toString() {
        return "BOMBED_WALL";
    }
}
