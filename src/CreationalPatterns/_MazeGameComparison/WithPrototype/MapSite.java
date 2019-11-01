package CreationalPatterns._MazeGameComparison.WithPrototype;

abstract class MapSite implements Cloneable {
    abstract void onEnter();

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
