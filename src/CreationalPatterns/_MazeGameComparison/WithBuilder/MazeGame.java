package CreationalPatterns._MazeGameComparison.WithBuilder;

class MazeGame {
    Maze createMaze(MazeBuilder builder) {
        builder.buildMaze();
        builder.buildRoom(1);
        builder.buildRoom(2);
        builder.buildDoor(1, 2);
        return builder.getMaze();
    }

    Maze createComplexMaze(MazeBuilder builder) {
        builder.buildMaze();
        builder.buildRoom(1);
        builder.buildRoom(2);
        builder.buildRoom(3);
        builder.buildDoor(1, 2);
        builder.buildDoor(2, 3);
        return builder.getMaze();
    }
}
