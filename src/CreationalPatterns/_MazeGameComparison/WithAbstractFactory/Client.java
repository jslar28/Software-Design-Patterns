package CreationalPatterns._MazeGameComparison.WithAbstractFactory;

public class Client {
    public static void main(String[] args) {
        MazeGame mazeGame = new MazeGame();
        Maze maze = mazeGame.createMaze(new StandardMazeFactory());
        System.out.println(maze.getRoom(1).toString());
        System.out.println(maze.getRoom(2).toString());
    }
}
