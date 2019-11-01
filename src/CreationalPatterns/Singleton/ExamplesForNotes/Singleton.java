package CreationalPatterns.Singleton.ExamplesForNotes;

public class Singleton {
    private static Singleton instance;

    static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private Singleton() {}
}
