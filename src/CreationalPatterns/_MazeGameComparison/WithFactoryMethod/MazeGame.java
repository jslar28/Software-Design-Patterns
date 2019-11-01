package CreationalPatterns._MazeGameComparison.WithFactoryMethod;

class MazeGame {

    Maze createMaze() {
        Maze maze = makeMaze();
        Room room1 = makeRoom(1);
        Room room2 = makeRoom(2);
        Door door = makeDoor(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(Direction.NORTH, makeWall());
        room1.setSide(Direction.EAST, door);
        room1.setSide(Direction.SOUTH, makeWall());
        room1.setSide(Direction.WEST, makeWall());

        room2.setSide(Direction.NORTH, makeWall());
        room2.setSide(Direction.SOUTH, makeWall());
        room2.setSide(Direction.EAST, makeWall());
        room2.setSide(Direction.WEST, door);

        return maze;
    }

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
