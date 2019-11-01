package CreationalPatterns.Prototype.AbstractExample;

abstract class AbstractPrototype implements Cloneable {
    int x;
    int y;

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

    abstract void someMethod();
}
