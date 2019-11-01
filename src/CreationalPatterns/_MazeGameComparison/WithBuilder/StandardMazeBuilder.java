package CreationalPatterns._MazeGameComparison.WithBuilder;

class StandardMazeBuilder extends MazeBuilder {
    private Maze currentMaze;

    @Override
    void buildMaze() {
        currentMaze = new Maze();
    }

    @Override
    void buildRoom(int i) {
        if (currentMaze.getRoom(i) == null) {
            Room room = new Room(i);
            currentMaze.addRoom(room);
            room.setSide(Direction.NORTH, makeWall());
            room.setSide(Direction.EAST, makeWall());
            room.setSide(Direction.SOUTH, makeWall());
            room.setSide(Direction.WEST, makeWall());
        }
    }

    @Override
    void buildDoor(int from, int to) {
        if (currentMaze.getRoom(from) != null && currentMaze.getRoom(to) != null) {
            Door door = new Door(currentMaze.getRoom(from), currentMaze.getRoom(to));
            Room room1 = currentMaze.getRoom(from);
            Room room2 = currentMaze.getRoom(to);
            room1.setSide(commonWall(room1, room2), door);
            room2.setSide(commonWall(room2, room1), door);
        }
    }

    private Wall makeWall() {
        return new Wall();
    }

    private Direction commonWall(Room from, Room to) {
        // Needs coordinates to be implemented
        if (from.getRoomNumber() % 2 == 0) {
            return Direction.SOUTH;
        }
        return Direction.NORTH;
    }

    @Override
    Maze getMaze() {
        return currentMaze;
    }
}
