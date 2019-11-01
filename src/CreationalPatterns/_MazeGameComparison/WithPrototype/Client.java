package CreationalPatterns._MazeGameComparison.WithPrototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        MazeGame mazeGame = new MazeGame();
        MazePrototypeFactory mazePrototypeFactory = new MazePrototypeFactory(
                new Maze(),
                new BombedWall(),
                new Room(1),
                new Door()
        );
        Maze maze = mazeGame.createMaze(mazePrototypeFactory);
        for (Room room: maze.getRooms()) {
            System.out.println(room.toString());
        }
    }
}
