package CreationalPatterns._MazeGameComparison.WithFactoryMethod;

public class Client {
    public static void main(String[] args) {
        MazeGame mazeGame = new BombedMazeGame();
        Maze maze = mazeGame.createMaze();
        System.out.println(maze.getRoom(1).toString());
        System.out.println(maze.getRoom(2).toString());
    }
}
