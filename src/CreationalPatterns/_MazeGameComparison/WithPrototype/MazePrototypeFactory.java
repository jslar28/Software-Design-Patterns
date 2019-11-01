package CreationalPatterns._MazeGameComparison.WithPrototype;

public class MazePrototypeFactory extends MazeFactory {
    private Maze prototypeMaze;
    private Wall prototypeWall;
    private Room prototypeRoom;
    private Door prototypeDoor;

    public MazePrototypeFactory(Maze maze, Wall wall, Room room, Door door) {
        this.prototypeMaze = maze;
        this.prototypeWall = wall;
        this.prototypeRoom = room;
        this.prototypeDoor = door;
    }

    @Override
    Maze makeMaze() throws CloneNotSupportedException {
        return (Maze) prototypeMaze.clone();
    }

    @Override
    Room makeRoom(int i) {
        return (Room) prototypeRoom.clone();
    }

    @Override
    Door makeDoor(Room from, Room to) {
        return (Door) prototypeDoor.clone();
    }

    @Override
    Wall makeWall() {
        return (Wall) prototypeWall.clone();
    }
}
