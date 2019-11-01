package CreationalPatterns._MazeGameComparison.WithAbstractFactory;

class BombedMazeFactory extends MazeFactory {
    @Override
    BombedWall makeWall() {
        return new BombedWall();
    }
}
