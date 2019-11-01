package CreationalPatterns._MazeGameComparison.WithAbstractFactory;

public class Wall extends MapSite {
    @Override
    void onEnter() {
        System.out.println("Ran into wall");
    }

    public String toString() {
        return "WALL";
    }
}
