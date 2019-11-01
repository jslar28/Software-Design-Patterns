package CreationalPatterns.Singleton.ExamplesForNotes.Clone.Fix;

public class Singleton {
    private static Singleton instance;

    static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private Singleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method instead.");
        }
    }
}

