package CreationalPatterns._MazeGameComparison.WithBuilder;

abstract class MazeBuilder {
    void buildMaze() { }
    void buildRoom(int room) { }
    void buildDoor(int from, int to) { }
    Maze getMaze() {
        return null;
    }

}
