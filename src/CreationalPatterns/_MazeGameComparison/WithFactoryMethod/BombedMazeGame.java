package CreationalPatterns._MazeGameComparison.WithFactoryMethod;

public class BombedMazeGame extends MazeGame {
    @Override
    BombedWall makeWall() {
        return new BombedWall();
    }
}
