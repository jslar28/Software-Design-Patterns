package CreationalPatterns._MazeGameComparison.WithAbstractFactory;

abstract class MazeFactory {
    Maze makeMaze() {
        return new Maze();
    }

    Room makeRoom(int i) {
        return new Room(i);
    }

    Door makeDoor(Room from, Room to) {
        return new Door(from , to);
    }

    Wall makeWall() {
        return new Wall();
    }
}
