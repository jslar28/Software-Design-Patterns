package CreationalPatterns._MazeGameComparison.NoPattern;

public class Client {
    public static void main(String[] args) {
        MazeGame mazeGame = new MazeGame();
        Maze maze = mazeGame.createMaze();
        System.out.println(maze.getRoom(1).toString());
        System.out.println(maze.getRoom(2).toString());
    }
}
