package CreationalPatterns._MazeGameComparison.WithBuilder;

public class Client {
    public static void main(String[] args) {
        MazeGame mazeGame = new MazeGame();
        StandardMazeBuilder standardMazeBuilder = new StandardMazeBuilder();
        BombedMazeBuilder bombedMazeBuilder = new BombedMazeBuilder();

        mazeGame.createMaze(bombedMazeBuilder);
        mazeGame.createComplexMaze(standardMazeBuilder);

        Maze maze = bombedMazeBuilder.getMaze();
        Maze complexMaze = standardMazeBuilder.getMaze();

        for (Room room: maze.getRooms()) {
            System.out.println(room.toString());
        }

        for (Room room: complexMaze.getRooms()) {
            System.out.println(room.toString());
        }
    }
}
