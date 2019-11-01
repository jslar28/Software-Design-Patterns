package CreationalPatterns.Singleton.ExamplesForNotes.Clone.Break;

public class Singleton implements Cloneable {
    private static Singleton instance;

    static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    static Singleton someRandomMethod() {
        Singleton singleton = null;
        try {
            singleton = (Singleton) getInstance().clone();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return singleton;
    }

    @Override
    protected Singleton clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Don't clone the singleton.");
    }

    private Singleton() {}
}
