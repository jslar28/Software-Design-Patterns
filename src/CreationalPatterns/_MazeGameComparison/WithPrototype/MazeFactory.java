package CreationalPatterns._MazeGameComparison.WithPrototype;

abstract class MazeFactory {
    Maze makeMaze() throws CloneNotSupportedException {
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
